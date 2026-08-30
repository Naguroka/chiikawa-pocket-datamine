package org.objectweb.asm.commons;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Remapper {
    public java.lang.String map(java.lang.String str) {
        return str;
    }

    public java.lang.String mapAnnotationAttributeName(java.lang.String str, java.lang.String str2) {
        return str2;
    }

    public java.lang.String mapFieldName(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return str2;
    }

    public java.lang.String mapInvokeDynamicMethodName(java.lang.String str, java.lang.String str2) {
        return str;
    }

    public java.lang.String mapMethodName(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return str2;
    }

    public java.lang.String mapModuleName(java.lang.String str) {
        return str;
    }

    public java.lang.String mapPackageName(java.lang.String str) {
        return str;
    }

    public java.lang.String mapRecordComponentName(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return str2;
    }

    public java.lang.String mapDesc(java.lang.String str) {
        return mapType(org.objectweb.asm.Type.getType(str)).getDescriptor();
    }

    private org.objectweb.asm.Type mapType(org.objectweb.asm.Type type) {
        switch (type.getSort()) {
            case 9:
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                for (int i = 0; i < type.getDimensions(); i++) {
                    sb.append('[');
                }
                sb.append(mapType(type.getElementType()).getDescriptor());
                return org.objectweb.asm.Type.getType(sb.toString());
            case 10:
                java.lang.String map = map(type.getInternalName());
                return map != null ? org.objectweb.asm.Type.getObjectType(map) : type;
            case 11:
                return org.objectweb.asm.Type.getMethodType(mapMethodDesc(type.getDescriptor()));
            default:
                return type;
        }
    }

    public java.lang.String mapType(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return mapType(org.objectweb.asm.Type.getObjectType(str)).getInternalName();
    }

    public java.lang.String[] mapTypes(java.lang.String[] strArr) {
        java.lang.String[] strArr2 = null;
        for (int i = 0; i < strArr.length; i++) {
            java.lang.String strMapType = mapType(strArr[i]);
            if (strMapType != null) {
                if (strArr2 == null) {
                    strArr2 = (java.lang.String[]) strArr.clone();
                }
                strArr2[i] = strMapType;
            }
        }
        return strArr2 != null ? strArr2 : strArr;
    }

    public java.lang.String mapMethodDesc(java.lang.String str) {
        if ("()V".equals(str)) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
        for (org.objectweb.asm.Type type : org.objectweb.asm.Type.getArgumentTypes(str)) {
            sb.append(mapType(type).getDescriptor());
        }
        org.objectweb.asm.Type returnType = org.objectweb.asm.Type.getReturnType(str);
        if (returnType == org.objectweb.asm.Type.VOID_TYPE) {
            sb.append(")V");
        } else {
            sb.append(')').append(mapType(returnType).getDescriptor());
        }
        return sb.toString();
    }

    public java.lang.Object mapValue(java.lang.Object obj) {
        java.lang.String strMapMethodDesc;
        if (obj instanceof org.objectweb.asm.Type) {
            return mapType((org.objectweb.asm.Type) obj);
        }
        if (obj instanceof org.objectweb.asm.Handle) {
            org.objectweb.asm.Handle handle = (org.objectweb.asm.Handle) obj;
            int tag = handle.getTag();
            java.lang.String strMapType = mapType(handle.getOwner());
            java.lang.String strMapMethodName = mapMethodName(handle.getOwner(), handle.getName(), handle.getDesc());
            if (handle.getTag() <= 4) {
                strMapMethodDesc = mapDesc(handle.getDesc());
            } else {
                strMapMethodDesc = mapMethodDesc(handle.getDesc());
            }
            return new org.objectweb.asm.Handle(tag, strMapType, strMapMethodName, strMapMethodDesc, handle.isInterface());
        }
        if (!(obj instanceof org.objectweb.asm.ConstantDynamic)) {
            return obj;
        }
        org.objectweb.asm.ConstantDynamic constantDynamic = (org.objectweb.asm.ConstantDynamic) obj;
        int bootstrapMethodArgumentCount = constantDynamic.getBootstrapMethodArgumentCount();
        java.lang.Object[] objArr = new java.lang.Object[bootstrapMethodArgumentCount];
        for (int i = 0; i < bootstrapMethodArgumentCount; i++) {
            objArr[i] = mapValue(constantDynamic.getBootstrapMethodArgument(i));
        }
        java.lang.String descriptor = constantDynamic.getDescriptor();
        return new org.objectweb.asm.ConstantDynamic(mapInvokeDynamicMethodName(constantDynamic.getName(), descriptor), mapDesc(descriptor), (org.objectweb.asm.Handle) mapValue(constantDynamic.getBootstrapMethod()), objArr);
    }

    public java.lang.String mapSignature(java.lang.String str, boolean z) {
        if (str == null) {
            return null;
        }
        org.objectweb.asm.signature.SignatureReader signatureReader = new org.objectweb.asm.signature.SignatureReader(str);
        org.objectweb.asm.signature.SignatureWriter signatureWriter = new org.objectweb.asm.signature.SignatureWriter();
        org.objectweb.asm.signature.SignatureVisitor signatureVisitorCreateSignatureRemapper = createSignatureRemapper(signatureWriter);
        if (z) {
            signatureReader.acceptType(signatureVisitorCreateSignatureRemapper);
        } else {
            signatureReader.accept(signatureVisitorCreateSignatureRemapper);
        }
        return signatureWriter.toString();
    }

    @java.lang.Deprecated
    protected org.objectweb.asm.signature.SignatureVisitor createRemappingSignatureAdapter(org.objectweb.asm.signature.SignatureVisitor signatureVisitor) {
        return createSignatureRemapper(signatureVisitor);
    }

    protected org.objectweb.asm.signature.SignatureVisitor createSignatureRemapper(org.objectweb.asm.signature.SignatureVisitor signatureVisitor) {
        return new org.objectweb.asm.commons.SignatureRemapper(signatureVisitor, this);
    }

    public java.lang.String mapInnerClassName(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String strMapType = mapType(str);
        if (!strMapType.contains("$")) {
            return str3;
        }
        int iLastIndexOf = strMapType.lastIndexOf(36);
        do {
            iLastIndexOf++;
            if (iLastIndexOf >= strMapType.length()) {
                break;
            }
        } while (java.lang.Character.isDigit(strMapType.charAt(iLastIndexOf)));
        return strMapType.substring(iLastIndexOf);
    }
}

package org.objectweb.asm.tree.analysis;

/* JADX INFO: loaded from: classes6.dex */
public class SimpleVerifier extends org.objectweb.asm.tree.analysis.BasicVerifier {
    private final org.objectweb.asm.Type currentClass;
    private final java.util.List<org.objectweb.asm.Type> currentClassInterfaces;
    private final org.objectweb.asm.Type currentSuperClass;
    private final boolean isInterface;
    private java.lang.ClassLoader loader;

    public SimpleVerifier() {
        this(null, null, false);
    }

    public SimpleVerifier(org.objectweb.asm.Type type, org.objectweb.asm.Type type2, boolean z) {
        this(type, type2, null, z);
    }

    public SimpleVerifier(org.objectweb.asm.Type type, org.objectweb.asm.Type type2, java.util.List<org.objectweb.asm.Type> list, boolean z) {
        this(589824, type, type2, list, z);
        if (getClass() != org.objectweb.asm.tree.analysis.SimpleVerifier.class) {
            throw new java.lang.IllegalStateException();
        }
    }

    protected SimpleVerifier(int i, org.objectweb.asm.Type type, org.objectweb.asm.Type type2, java.util.List<org.objectweb.asm.Type> list, boolean z) {
        super(i);
        this.loader = getClass().getClassLoader();
        this.currentClass = type;
        this.currentSuperClass = type2;
        this.currentClassInterfaces = list;
        this.isInterface = z;
    }

    public void setClassLoader(java.lang.ClassLoader classLoader) {
        this.loader = classLoader;
    }

    @Override // org.objectweb.asm.tree.analysis.BasicInterpreter, org.objectweb.asm.tree.analysis.Interpreter
    public org.objectweb.asm.tree.analysis.BasicValue newValue(org.objectweb.asm.Type type) {
        int sort;
        if (type == null) {
            return org.objectweb.asm.tree.analysis.BasicValue.UNINITIALIZED_VALUE;
        }
        boolean z = type.getSort() == 9;
        if (z && ((sort = type.getElementType().getSort()) == 1 || sort == 2 || sort == 3 || sort == 4)) {
            return new org.objectweb.asm.tree.analysis.BasicValue(type);
        }
        org.objectweb.asm.tree.analysis.BasicValue basicValueNewValue = super.newValue(type);
        if (!org.objectweb.asm.tree.analysis.BasicValue.REFERENCE_VALUE.equals(basicValueNewValue)) {
            return basicValueNewValue;
        }
        if (z) {
            org.objectweb.asm.tree.analysis.BasicValue basicValueNewValue2 = newValue(type.getElementType());
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            for (int i = 0; i < type.getDimensions(); i++) {
                sb.append('[');
            }
            sb.append(basicValueNewValue2.getType().getDescriptor());
            return new org.objectweb.asm.tree.analysis.BasicValue(org.objectweb.asm.Type.getType(sb.toString()));
        }
        return new org.objectweb.asm.tree.analysis.BasicValue(type);
    }

    @Override // org.objectweb.asm.tree.analysis.BasicVerifier
    protected boolean isArrayValue(org.objectweb.asm.tree.analysis.BasicValue basicValue) {
        org.objectweb.asm.Type type = basicValue.getType();
        return type != null && (type.getSort() == 9 || type.equals(NULL_TYPE));
    }

    @Override // org.objectweb.asm.tree.analysis.BasicVerifier
    protected org.objectweb.asm.tree.analysis.BasicValue getElementValue(org.objectweb.asm.tree.analysis.BasicValue basicValue) throws org.objectweb.asm.tree.analysis.AnalyzerException {
        org.objectweb.asm.Type type = basicValue.getType();
        if (type != null) {
            if (type.getSort() == 9) {
                return newValue(org.objectweb.asm.Type.getType(type.getDescriptor().substring(1)));
            }
            if (type.equals(NULL_TYPE)) {
                return basicValue;
            }
        }
        throw new java.lang.AssertionError();
    }

    @Override // org.objectweb.asm.tree.analysis.BasicVerifier
    protected boolean isSubTypeOf(org.objectweb.asm.tree.analysis.BasicValue basicValue, org.objectweb.asm.tree.analysis.BasicValue basicValue2) {
        org.objectweb.asm.Type type = basicValue2.getType();
        org.objectweb.asm.Type type2 = basicValue.getType();
        switch (type.getSort()) {
            case 5:
            case 6:
            case 7:
            case 8:
                return type2.equals(type);
            case 9:
            case 10:
                if (type2.equals(NULL_TYPE)) {
                    return true;
                }
                if (type2.getSort() != 10 && type2.getSort() != 9) {
                    return false;
                }
                if (isAssignableFrom(type, type2)) {
                    return true;
                }
                if (getClass(type).isInterface()) {
                    return java.lang.Object.class.isAssignableFrom(getClass(type2));
                }
                return false;
            default:
                throw new java.lang.AssertionError();
        }
    }

    @Override // org.objectweb.asm.tree.analysis.BasicInterpreter, org.objectweb.asm.tree.analysis.Interpreter
    public org.objectweb.asm.tree.analysis.BasicValue merge(org.objectweb.asm.tree.analysis.BasicValue basicValue, org.objectweb.asm.tree.analysis.BasicValue basicValue2) {
        int dimensions;
        if (basicValue.equals(basicValue2)) {
            return basicValue;
        }
        org.objectweb.asm.Type type = basicValue.getType();
        org.objectweb.asm.Type type2 = basicValue2.getType();
        if (type != null && ((type.getSort() == 10 || type.getSort() == 9) && type2 != null && (type2.getSort() == 10 || type2.getSort() == 9))) {
            if (type.equals(NULL_TYPE)) {
                return basicValue2;
            }
            if (type2.equals(NULL_TYPE) || isAssignableFrom(type, type2)) {
                return basicValue;
            }
            if (isAssignableFrom(type2, type)) {
                return basicValue2;
            }
            if (type.getSort() == 9 && type2.getSort() == 9 && type.getDimensions() == type2.getDimensions() && type.getElementType().getSort() == 10 && type2.getElementType().getSort() == 10) {
                dimensions = type.getDimensions();
                type = type.getElementType();
                type2 = type2.getElementType();
            } else {
                dimensions = 0;
            }
            while (type != null && !isInterface(type)) {
                type = getSuperClass(type);
                if (isAssignableFrom(type, type2)) {
                    return newArrayValue(type, dimensions);
                }
            }
            return newArrayValue(org.objectweb.asm.Type.getObjectType("java/lang/Object"), dimensions);
        }
        return org.objectweb.asm.tree.analysis.BasicValue.UNINITIALIZED_VALUE;
    }

    private org.objectweb.asm.tree.analysis.BasicValue newArrayValue(org.objectweb.asm.Type type, int i) {
        if (i == 0) {
            return newValue(type);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append('[');
        }
        sb.append(type.getDescriptor());
        return newValue(org.objectweb.asm.Type.getType(sb.toString()));
    }

    protected boolean isInterface(org.objectweb.asm.Type type) {
        org.objectweb.asm.Type type2 = this.currentClass;
        if (type2 != null && type2.equals(type)) {
            return this.isInterface;
        }
        return getClass(type).isInterface();
    }

    protected org.objectweb.asm.Type getSuperClass(org.objectweb.asm.Type type) {
        org.objectweb.asm.Type type2 = this.currentClass;
        if (type2 != null && type2.equals(type)) {
            return this.currentSuperClass;
        }
        java.lang.Class<? super java.lang.Object> superclass = getClass(type).getSuperclass();
        if (superclass == null) {
            return null;
        }
        return org.objectweb.asm.Type.getType(superclass);
    }

    protected boolean isAssignableFrom(org.objectweb.asm.Type type, org.objectweb.asm.Type type2) {
        if (type.equals(type2)) {
            return true;
        }
        org.objectweb.asm.Type type3 = this.currentClass;
        if (type3 != null && type3.equals(type)) {
            if (getSuperClass(type2) == null) {
                return false;
            }
            if (this.isInterface) {
                return type2.getSort() == 10 || type2.getSort() == 9;
            }
            return isAssignableFrom(type, getSuperClass(type2));
        }
        org.objectweb.asm.Type type4 = this.currentClass;
        if (type4 != null && type4.equals(type2)) {
            if (isAssignableFrom(type, this.currentSuperClass)) {
                return true;
            }
            java.util.List<org.objectweb.asm.Type> list = this.currentClassInterfaces;
            if (list != null) {
                java.util.Iterator<org.objectweb.asm.Type> it = list.iterator();
                while (it.hasNext()) {
                    if (isAssignableFrom(type, it.next())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return getClass(type).isAssignableFrom(getClass(type2));
    }

    protected java.lang.Class<?> getClass(org.objectweb.asm.Type type) {
        try {
            if (type.getSort() == 9) {
                return java.lang.Class.forName(type.getDescriptor().replace('/', '.'), false, this.loader);
            }
            return java.lang.Class.forName(type.getClassName(), false, this.loader);
        } catch (java.lang.ClassNotFoundException e) {
            throw new java.lang.TypeNotPresentException(e.toString(), e);
        }
    }
}

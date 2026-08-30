package org.objectweb.asm;

/* JADX INFO: loaded from: classes6.dex */
public class ClassReader {
    static final int EXPAND_ASM_INSNS = 256;
    public static final int EXPAND_FRAMES = 8;
    private static final int INPUT_STREAM_DATA_CHUNK_SIZE = 4096;
    private static final int MAX_BUFFER_SIZE = 1048576;
    public static final int SKIP_CODE = 1;
    public static final int SKIP_DEBUG = 2;
    public static final int SKIP_FRAMES = 4;

    @java.lang.Deprecated
    public final byte[] b;
    private final int[] bootstrapMethodOffsets;
    final byte[] classFileBuffer;
    private final org.objectweb.asm.ConstantDynamic[] constantDynamicValues;
    private final java.lang.String[] constantUtf8Values;
    private final int[] cpInfoOffsets;
    public final int header;
    private final int maxStringLength;

    public ClassReader(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public ClassReader(byte[] bArr, int i, int i2) {
        this(bArr, i, true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    ClassReader(byte[] bArr, int i, boolean z) {
        this.classFileBuffer = bArr;
        this.b = bArr;
        if (z) {
            int i2 = i + 6;
            if (readShort(i2) > 62) {
                throw new java.lang.IllegalArgumentException("Unsupported class file major version " + ((int) readShort(i2)));
            }
        }
        int unsignedShort = readUnsignedShort(i + 8);
        this.cpInfoOffsets = new int[unsignedShort];
        this.constantUtf8Values = new java.lang.String[unsignedShort];
        int i3 = i + 10;
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        int i5 = 1;
        while (i5 < unsignedShort) {
            int i6 = i5 + 1;
            int i7 = i3 + 1;
            this.cpInfoOffsets[i5] = i7;
            int unsignedShort2 = 3;
            switch (bArr[i3]) {
                case 1:
                    unsignedShort2 = 3 + readUnsignedShort(i7);
                    if (unsignedShort2 > i4) {
                        i4 = unsignedShort2;
                    }
                    i5 = i6;
                    i3 += unsignedShort2;
                    break;
                case 2:
                case 13:
                case 14:
                default:
                    throw new java.lang.IllegalArgumentException();
                case 3:
                case 4:
                case 9:
                case 10:
                case 11:
                case 12:
                    i5 = i6;
                    unsignedShort2 = 5;
                    i3 += unsignedShort2;
                    break;
                case 5:
                case 6:
                    i6++;
                    unsignedShort2 = 9;
                    i5 = i6;
                    i3 += unsignedShort2;
                    break;
                case 7:
                case 8:
                case 16:
                case 19:
                case 20:
                    i5 = i6;
                    i3 += unsignedShort2;
                    break;
                case 15:
                    unsignedShort2 = 4;
                    i5 = i6;
                    i3 += unsignedShort2;
                    break;
                case 17:
                    z2 = true;
                    z3 = true;
                    i5 = i6;
                    unsignedShort2 = 5;
                    i3 += unsignedShort2;
                    break;
                case 18:
                    z3 = true;
                    i5 = i6;
                    unsignedShort2 = 5;
                    i3 += unsignedShort2;
                    break;
            }
        }
        this.maxStringLength = i4;
        this.header = i3;
        this.constantDynamicValues = z2 ? new org.objectweb.asm.ConstantDynamic[unsignedShort] : null;
        this.bootstrapMethodOffsets = z3 ? readBootstrapMethodsAttribute(i4) : null;
    }

    public ClassReader(java.io.InputStream inputStream) throws java.io.IOException {
        this(readStream(inputStream, false));
    }

    public ClassReader(java.lang.String str) throws java.io.IOException {
        this(readStream(java.lang.ClassLoader.getSystemResourceAsStream(str.replace('.', '/') + ".class"), true));
    }

    private static byte[] readStream(java.io.InputStream inputStream, boolean z) throws java.io.IOException {
        if (inputStream == null) {
            throw new java.io.IOException("Class not found");
        }
        int iCalculateBufferSize = calculateBufferSize(inputStream);
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[iCalculateBufferSize];
                int i = 0;
                while (true) {
                    int i2 = inputStream.read(bArr, 0, iCalculateBufferSize);
                    if (i2 == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i2);
                    i++;
                }
                byteArrayOutputStream.flush();
                if (i != 1) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    if (z) {
                        inputStream.close();
                    }
                    return byteArray;
                }
                byteArrayOutputStream.close();
                if (z) {
                    inputStream.close();
                }
                return bArr;
            } catch (java.lang.Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (java.lang.Throwable unused) {
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            if (z) {
                inputStream.close();
            }
            throw th2;
        }
    }

    private static int calculateBufferSize(java.io.InputStream inputStream) throws java.io.IOException {
        int iAvailable = inputStream.available();
        if (iAvailable < 256) {
            return 4096;
        }
        return java.lang.Math.min(iAvailable, 1048576);
    }

    public int getAccess() {
        return readUnsignedShort(this.header);
    }

    public java.lang.String getClassName() {
        return readClass(this.header + 2, new char[this.maxStringLength]);
    }

    public java.lang.String getSuperName() {
        return readClass(this.header + 4, new char[this.maxStringLength]);
    }

    public java.lang.String[] getInterfaces() {
        int i = this.header + 6;
        int unsignedShort = readUnsignedShort(i);
        java.lang.String[] strArr = new java.lang.String[unsignedShort];
        if (unsignedShort > 0) {
            char[] cArr = new char[this.maxStringLength];
            for (int i2 = 0; i2 < unsignedShort; i2++) {
                i += 2;
                strArr[i2] = readClass(i, cArr);
            }
        }
        return strArr;
    }

    public void accept(org.objectweb.asm.ClassVisitor classVisitor, int i) {
        accept(classVisitor, new org.objectweb.asm.Attribute[0], i);
    }

    public void accept(org.objectweb.asm.ClassVisitor classVisitor, org.objectweb.asm.Attribute[] attributeArr, int i) {
        int i2;
        org.objectweb.asm.Context context = new org.objectweb.asm.Context();
        context.attributePrototypes = attributeArr;
        context.parsingOptions = i;
        context.charBuffer = new char[this.maxStringLength];
        char[] cArr = context.charBuffer;
        int i3 = this.header;
        int unsignedShort = readUnsignedShort(i3);
        java.lang.String str = readClass(i3 + 2, cArr);
        java.lang.String str2 = readClass(i3 + 4, cArr);
        int unsignedShort2 = readUnsignedShort(i3 + 6);
        java.lang.String[] strArr = new java.lang.String[unsignedShort2];
        int i4 = i3 + 8;
        for (int i5 = 0; i5 < unsignedShort2; i5++) {
            strArr[i5] = readClass(i4, cArr);
            i4 += 2;
        }
        int firstAttributeOffset = getFirstAttributeOffset();
        int i6 = unsignedShort;
        int unsignedShort3 = readUnsignedShort(firstAttributeOffset - 2);
        java.lang.String utf = null;
        java.lang.String utf8 = null;
        int i7 = 0;
        java.lang.String utf9 = null;
        int i8 = 0;
        java.lang.String str3 = null;
        java.lang.String str4 = null;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        org.objectweb.asm.Attribute attribute = null;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (unsignedShort3 > 0) {
            java.lang.String utf10 = readUTF8(firstAttributeOffset, cArr);
            int i18 = readInt(firstAttributeOffset + 2);
            int i19 = firstAttributeOffset + 6;
            java.lang.String str5 = utf;
            if ("SourceFile".equals(utf10)) {
                i2 = i19;
                utf8 = readUTF8(i19, cArr);
            } else if ("InnerClasses".equals(utf10)) {
                i16 = i19;
                i2 = i16;
            } else if ("EnclosingMethod".equals(utf10)) {
                i9 = i19;
                i2 = i9;
            } else if ("NestHost".equals(utf10)) {
                i2 = i19;
                str4 = readClass(i19, cArr);
            } else if ("NestMembers".equals(utf10)) {
                i14 = i19;
                i2 = i14;
            } else if ("PermittedSubclasses".equals(utf10)) {
                i15 = i19;
                i2 = i15;
            } else {
                if ("Signature".equals(utf10)) {
                    utf9 = readUTF8(i19, cArr);
                } else if ("RuntimeVisibleAnnotations".equals(utf10)) {
                    i10 = i19;
                    i2 = i10;
                } else if ("RuntimeVisibleTypeAnnotations".equals(utf10)) {
                    i12 = i19;
                    i2 = i12;
                } else if ("Deprecated".equals(utf10)) {
                    i6 |= 131072;
                } else if ("Synthetic".equals(utf10)) {
                    i6 |= 4096;
                } else {
                    if ("SourceDebugExtension".equals(utf10)) {
                        if (i18 > this.classFileBuffer.length - i19) {
                            throw new java.lang.IllegalArgumentException();
                        }
                        utf = readUtf(i19, i18, new char[i18]);
                        i2 = i19;
                    } else if ("RuntimeInvisibleAnnotations".equals(utf10)) {
                        i11 = i19;
                        i2 = i11;
                    } else if ("RuntimeInvisibleTypeAnnotations".equals(utf10)) {
                        i13 = i19;
                        i2 = i13;
                    } else if ("Record".equals(utf10)) {
                        i6 |= 65536;
                        i17 = i19;
                        i2 = i17;
                    } else if ("Module".equals(utf10)) {
                        i7 = i19;
                        i2 = i7;
                    } else if ("ModuleMainClass".equals(utf10)) {
                        str3 = readClass(i19, cArr);
                    } else if ("ModulePackages".equals(utf10)) {
                        i8 = i19;
                        i2 = i8;
                    } else if ("BootstrapMethods".equals(utf10)) {
                        i2 = i19;
                        i4 = i4;
                        i18 = i18;
                        strArr = strArr;
                        utf = str5;
                    } else {
                        i2 = i19;
                        i4 = i4;
                        i18 = i18;
                        strArr = strArr;
                        org.objectweb.asm.Attribute attribute2 = readAttribute(attributeArr, utf10, i2, i18, cArr, -1, null);
                        attribute2.nextAttribute = attribute;
                        attribute = attribute2;
                        i6 = i6;
                        utf = str5;
                        utf8 = utf8;
                    }
                    firstAttributeOffset = i2 + i18;
                    unsignedShort3--;
                    strArr = strArr;
                    i4 = i4;
                }
                i2 = i19;
            }
            utf = str5;
            firstAttributeOffset = i2 + i18;
            unsignedShort3--;
            strArr = strArr;
            i4 = i4;
        }
        java.lang.String str6 = utf;
        java.lang.String str7 = utf8;
        int i20 = i4;
        java.lang.String[] strArr2 = strArr;
        org.objectweb.asm.Attribute attribute3 = attribute;
        classVisitor.visit(readInt(this.cpInfoOffsets[1] - 7), i6, str, utf9, str2, strArr2);
        if ((i & 2) == 0 && (str7 != null || str6 != null)) {
            classVisitor.visitSource(str7, str6);
        }
        if (i7 != 0) {
            readModuleAttributes(classVisitor, context, i7, i8, str3);
        }
        java.lang.String str8 = str4;
        if (str8 != null) {
            classVisitor.visitNestHost(str8);
        }
        int i21 = i9;
        if (i21 != 0) {
            java.lang.String str9 = readClass(i21, cArr);
            int unsignedShort4 = readUnsignedShort(i21 + 2);
            classVisitor.visitOuterClass(str9, unsignedShort4 == 0 ? null : readUTF8(this.cpInfoOffsets[unsignedShort4], cArr), unsignedShort4 == 0 ? null : readUTF8(this.cpInfoOffsets[unsignedShort4] + 2, cArr));
        }
        int i22 = i10;
        if (i22 != 0) {
            int unsignedShort5 = readUnsignedShort(i22);
            int elementValues = i22 + 2;
            while (true) {
                int i23 = unsignedShort5 - 1;
                if (unsignedShort5 <= 0) {
                    break;
                }
                elementValues = readElementValues(classVisitor.visitAnnotation(readUTF8(elementValues, cArr), true), elementValues + 2, true, cArr);
                unsignedShort5 = i23;
            }
        }
        int i24 = i11;
        if (i24 != 0) {
            int unsignedShort6 = readUnsignedShort(i24);
            int elementValues2 = i24 + 2;
            while (true) {
                int i25 = unsignedShort6 - 1;
                if (unsignedShort6 <= 0) {
                    break;
                }
                elementValues2 = readElementValues(classVisitor.visitAnnotation(readUTF8(elementValues2, cArr), false), elementValues2 + 2, true, cArr);
                unsignedShort6 = i25;
            }
        }
        int i26 = i12;
        if (i26 != 0) {
            int unsignedShort7 = readUnsignedShort(i26);
            int elementValues3 = i26 + 2;
            while (true) {
                int i27 = unsignedShort7 - 1;
                if (unsignedShort7 <= 0) {
                    break;
                }
                int typeAnnotationTarget = readTypeAnnotationTarget(context, elementValues3);
                elementValues3 = readElementValues(classVisitor.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, readUTF8(typeAnnotationTarget, cArr), true), typeAnnotationTarget + 2, true, cArr);
                unsignedShort7 = i27;
            }
        }
        int i28 = i13;
        if (i28 != 0) {
            int unsignedShort8 = readUnsignedShort(i28);
            int elementValues4 = i28 + 2;
            while (true) {
                int i29 = unsignedShort8 - 1;
                if (unsignedShort8 <= 0) {
                    break;
                }
                int typeAnnotationTarget2 = readTypeAnnotationTarget(context, elementValues4);
                elementValues4 = readElementValues(classVisitor.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, readUTF8(typeAnnotationTarget2, cArr), false), typeAnnotationTarget2 + 2, true, cArr);
                unsignedShort8 = i29;
            }
        }
        while (attribute3 != null) {
            org.objectweb.asm.Attribute attribute4 = attribute3.nextAttribute;
            attribute3.nextAttribute = null;
            classVisitor.visitAttribute(attribute3);
            attribute3 = attribute4;
        }
        int i30 = i14;
        if (i30 != 0) {
            int unsignedShort9 = readUnsignedShort(i30);
            int i31 = i30 + 2;
            while (true) {
                int i32 = unsignedShort9 - 1;
                if (unsignedShort9 <= 0) {
                    break;
                }
                classVisitor.visitNestMember(readClass(i31, cArr));
                i31 += 2;
                unsignedShort9 = i32;
            }
        }
        int i33 = i15;
        if (i33 != 0) {
            int unsignedShort10 = readUnsignedShort(i33);
            int i34 = i33 + 2;
            while (true) {
                int i35 = unsignedShort10 - 1;
                if (unsignedShort10 <= 0) {
                    break;
                }
                classVisitor.visitPermittedSubclass(readClass(i34, cArr));
                i34 += 2;
                unsignedShort10 = i35;
            }
        }
        int i36 = i16;
        if (i36 != 0) {
            int unsignedShort11 = readUnsignedShort(i36);
            int i37 = i36 + 2;
            while (true) {
                int i38 = unsignedShort11 - 1;
                if (unsignedShort11 <= 0) {
                    break;
                }
                classVisitor.visitInnerClass(readClass(i37, cArr), readClass(i37 + 2, cArr), readUTF8(i37 + 4, cArr), readUnsignedShort(i37 + 6));
                i37 += 8;
                unsignedShort11 = i38;
            }
        }
        int i39 = i17;
        if (i39 != 0) {
            int unsignedShort12 = readUnsignedShort(i39);
            int recordComponent = i39 + 2;
            while (true) {
                int i40 = unsignedShort12 - 1;
                if (unsignedShort12 <= 0) {
                    break;
                }
                recordComponent = readRecordComponent(classVisitor, context, recordComponent);
                unsignedShort12 = i40;
            }
        }
        int unsignedShort13 = readUnsignedShort(i20);
        int field = i20 + 2;
        while (true) {
            int i41 = unsignedShort13 - 1;
            if (unsignedShort13 <= 0) {
                break;
            }
            field = readField(classVisitor, context, field);
            unsignedShort13 = i41;
        }
        int unsignedShort14 = readUnsignedShort(field);
        int method = field + 2;
        while (true) {
            int i42 = unsignedShort14 - 1;
            if (unsignedShort14 > 0) {
                method = readMethod(classVisitor, context, method);
                unsignedShort14 = i42;
            } else {
                classVisitor.visitEnd();
                return;
            }
        }
    }

    private void readModuleAttributes(org.objectweb.asm.ClassVisitor classVisitor, org.objectweb.asm.Context context, int i, int i2, java.lang.String str) {
        java.lang.String[] strArr;
        char[] cArr = context.charBuffer;
        java.lang.String module = readModule(i, cArr);
        int unsignedShort = readUnsignedShort(i + 2);
        java.lang.String utf8 = readUTF8(i + 4, cArr);
        int i3 = i + 6;
        org.objectweb.asm.ModuleVisitor moduleVisitorVisitModule = classVisitor.visitModule(module, unsignedShort, utf8);
        if (moduleVisitorVisitModule == null) {
            return;
        }
        if (str != null) {
            moduleVisitorVisitModule.visitMainClass(str);
        }
        if (i2 != 0) {
            int unsignedShort2 = readUnsignedShort(i2);
            int i4 = i2 + 2;
            while (true) {
                int i5 = unsignedShort2 - 1;
                if (unsignedShort2 <= 0) {
                    break;
                }
                moduleVisitorVisitModule.visitPackage(readPackage(i4, cArr));
                i4 += 2;
                unsignedShort2 = i5;
            }
        }
        int unsignedShort3 = readUnsignedShort(i3);
        int i6 = i3 + 2;
        while (true) {
            int i7 = unsignedShort3 - 1;
            if (unsignedShort3 <= 0) {
                break;
            }
            java.lang.String module2 = readModule(i6, cArr);
            int unsignedShort4 = readUnsignedShort(i6 + 2);
            java.lang.String utf9 = readUTF8(i6 + 4, cArr);
            i6 += 6;
            moduleVisitorVisitModule.visitRequire(module2, unsignedShort4, utf9);
            unsignedShort3 = i7;
        }
        int unsignedShort5 = readUnsignedShort(i6);
        int i8 = i6 + 2;
        while (true) {
            int i9 = unsignedShort5 - 1;
            java.lang.String[] strArr2 = null;
            if (unsignedShort5 <= 0) {
                break;
            }
            java.lang.String str2 = readPackage(i8, cArr);
            int unsignedShort6 = readUnsignedShort(i8 + 2);
            int unsignedShort7 = readUnsignedShort(i8 + 4);
            i8 += 6;
            if (unsignedShort7 != 0) {
                strArr2 = new java.lang.String[unsignedShort7];
                for (int i10 = 0; i10 < unsignedShort7; i10++) {
                    strArr2[i10] = readModule(i8, cArr);
                    i8 += 2;
                }
            }
            moduleVisitorVisitModule.visitExport(str2, unsignedShort6, strArr2);
            unsignedShort5 = i9;
        }
        int unsignedShort8 = readUnsignedShort(i8);
        int i11 = i8 + 2;
        while (true) {
            int i12 = unsignedShort8 - 1;
            if (unsignedShort8 <= 0) {
                break;
            }
            java.lang.String str3 = readPackage(i11, cArr);
            int unsignedShort9 = readUnsignedShort(i11 + 2);
            int unsignedShort10 = readUnsignedShort(i11 + 4);
            i11 += 6;
            if (unsignedShort10 != 0) {
                strArr = new java.lang.String[unsignedShort10];
                for (int i13 = 0; i13 < unsignedShort10; i13++) {
                    strArr[i13] = readModule(i11, cArr);
                    i11 += 2;
                }
            } else {
                strArr = null;
            }
            moduleVisitorVisitModule.visitOpen(str3, unsignedShort9, strArr);
            unsignedShort8 = i12;
        }
        int unsignedShort11 = readUnsignedShort(i11);
        int i14 = i11 + 2;
        while (true) {
            int i15 = unsignedShort11 - 1;
            if (unsignedShort11 <= 0) {
                break;
            }
            moduleVisitorVisitModule.visitUse(readClass(i14, cArr));
            i14 += 2;
            unsignedShort11 = i15;
        }
        int unsignedShort12 = readUnsignedShort(i14);
        int i16 = i14 + 2;
        while (true) {
            int i17 = unsignedShort12 - 1;
            if (unsignedShort12 > 0) {
                java.lang.String str4 = readClass(i16, cArr);
                int unsignedShort13 = readUnsignedShort(i16 + 2);
                i16 += 4;
                java.lang.String[] strArr3 = new java.lang.String[unsignedShort13];
                for (int i18 = 0; i18 < unsignedShort13; i18++) {
                    strArr3[i18] = readClass(i16, cArr);
                    i16 += 2;
                }
                moduleVisitorVisitModule.visitProvide(str4, strArr3);
                unsignedShort12 = i17;
            } else {
                moduleVisitorVisitModule.visitEnd();
                return;
            }
        }
    }

    private int readRecordComponent(org.objectweb.asm.ClassVisitor classVisitor, org.objectweb.asm.Context context, int i) {
        int i2;
        org.objectweb.asm.Context context2 = context;
        char[] cArr = context2.charBuffer;
        java.lang.String utf8 = readUTF8(i, cArr);
        java.lang.String utf9 = readUTF8(i + 2, cArr);
        int i3 = i + 4;
        int unsignedShort = readUnsignedShort(i3);
        int i4 = i3 + 2;
        int i5 = 0;
        org.objectweb.asm.Attribute attribute = null;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        java.lang.String utf10 = null;
        while (true) {
            int i9 = unsignedShort - 1;
            if (unsignedShort <= 0) {
                break;
            }
            java.lang.String utf11 = readUTF8(i4, cArr);
            int i10 = readInt(i4 + 2);
            int i11 = i4 + 6;
            if ("Signature".equals(utf11)) {
                utf10 = readUTF8(i11, cArr);
                i2 = i11;
            } else if ("RuntimeVisibleAnnotations".equals(utf11)) {
                i8 = i11;
                i2 = i8;
            } else if ("RuntimeVisibleTypeAnnotations".equals(utf11)) {
                i6 = i11;
                i2 = i6;
            } else if ("RuntimeInvisibleAnnotations".equals(utf11)) {
                i7 = i11;
                i2 = i7;
            } else if ("RuntimeInvisibleTypeAnnotations".equals(utf11)) {
                i5 = i11;
                i2 = i5;
            } else {
                i2 = i11;
                org.objectweb.asm.Attribute attribute2 = attribute;
                attribute = readAttribute(context2.attributePrototypes, utf11, i2, i10, cArr, -1, null);
                attribute.nextAttribute = attribute2;
                i8 = i8;
                i7 = i7;
                i6 = i6;
                i5 = i5;
            }
            i4 = i2 + i10;
            context2 = context;
            unsignedShort = i9;
        }
        int i12 = i5;
        org.objectweb.asm.Attribute attribute3 = attribute;
        int i13 = i6;
        int i14 = i7;
        int i15 = i8;
        org.objectweb.asm.RecordComponentVisitor recordComponentVisitorVisitRecordComponent = classVisitor.visitRecordComponent(utf8, utf9, utf10);
        if (recordComponentVisitorVisitRecordComponent == null) {
            return i4;
        }
        if (i15 != 0) {
            int unsignedShort2 = readUnsignedShort(i15);
            int elementValues = i15 + 2;
            while (true) {
                int i16 = unsignedShort2 - 1;
                if (unsignedShort2 <= 0) {
                    break;
                }
                elementValues = readElementValues(recordComponentVisitorVisitRecordComponent.visitAnnotation(readUTF8(elementValues, cArr), true), elementValues + 2, true, cArr);
                unsignedShort2 = i16;
            }
        }
        if (i14 != 0) {
            int unsignedShort3 = readUnsignedShort(i14);
            int elementValues2 = i14 + 2;
            while (true) {
                int i17 = unsignedShort3 - 1;
                if (unsignedShort3 <= 0) {
                    break;
                }
                elementValues2 = readElementValues(recordComponentVisitorVisitRecordComponent.visitAnnotation(readUTF8(elementValues2, cArr), false), elementValues2 + 2, true, cArr);
                unsignedShort3 = i17;
            }
        }
        if (i13 != 0) {
            int unsignedShort4 = readUnsignedShort(i13);
            int elementValues3 = i13 + 2;
            while (true) {
                int i18 = unsignedShort4 - 1;
                if (unsignedShort4 <= 0) {
                    break;
                }
                int typeAnnotationTarget = readTypeAnnotationTarget(context, elementValues3);
                elementValues3 = readElementValues(recordComponentVisitorVisitRecordComponent.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, readUTF8(typeAnnotationTarget, cArr), true), typeAnnotationTarget + 2, true, cArr);
                unsignedShort4 = i18;
            }
        }
        if (i12 != 0) {
            int unsignedShort5 = readUnsignedShort(i12);
            int elementValues4 = i12 + 2;
            while (true) {
                int i19 = unsignedShort5 - 1;
                if (unsignedShort5 <= 0) {
                    break;
                }
                int typeAnnotationTarget2 = readTypeAnnotationTarget(context, elementValues4);
                elementValues4 = readElementValues(recordComponentVisitorVisitRecordComponent.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, readUTF8(typeAnnotationTarget2, cArr), false), typeAnnotationTarget2 + 2, true, cArr);
                unsignedShort5 = i19;
            }
        }
        org.objectweb.asm.Attribute attribute4 = attribute3;
        while (attribute4 != null) {
            org.objectweb.asm.Attribute attribute5 = attribute4.nextAttribute;
            attribute4.nextAttribute = null;
            recordComponentVisitorVisitRecordComponent.visitAttribute(attribute4);
            attribute4 = attribute5;
        }
        recordComponentVisitorVisitRecordComponent.visitEnd();
        return i4;
    }

    private int readField(org.objectweb.asm.ClassVisitor classVisitor, org.objectweb.asm.Context context, int i) {
        int i2;
        int i3;
        org.objectweb.asm.Context context2 = context;
        char[] cArr = context2.charBuffer;
        int unsignedShort = readUnsignedShort(i);
        java.lang.String utf8 = readUTF8(i + 2, cArr);
        java.lang.String utf9 = readUTF8(i + 4, cArr);
        int i4 = i + 6;
        int unsignedShort2 = readUnsignedShort(i4);
        int i5 = i4 + 2;
        int i6 = unsignedShort;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        org.objectweb.asm.Attribute attribute = null;
        java.lang.String utf10 = null;
        java.lang.Object obj = null;
        while (true) {
            int i11 = unsignedShort2 - 1;
            if (unsignedShort2 <= 0) {
                break;
            }
            java.lang.String utf11 = readUTF8(i5, cArr);
            int i12 = readInt(i5 + 2);
            int i13 = i5 + 6;
            if ("ConstantValue".equals(utf11)) {
                int unsignedShort3 = readUnsignedShort(i13);
                obj = unsignedShort3 == 0 ? null : readConst(unsignedShort3, cArr);
            } else if ("Signature".equals(utf11)) {
                utf10 = readUTF8(i13, cArr);
            } else {
                if ("Deprecated".equals(utf11)) {
                    i3 = 131072 | i6;
                } else {
                    if ("Synthetic".equals(utf11)) {
                        i3 = i6 | 4096;
                    } else if ("RuntimeVisibleAnnotations".equals(utf11)) {
                        i10 = i13;
                        i2 = i10;
                    } else if ("RuntimeVisibleTypeAnnotations".equals(utf11)) {
                        i8 = i13;
                        i2 = i8;
                    } else if ("RuntimeInvisibleAnnotations".equals(utf11)) {
                        i9 = i13;
                        i2 = i9;
                    } else if ("RuntimeInvisibleTypeAnnotations".equals(utf11)) {
                        i7 = i13;
                        i2 = i7;
                    } else {
                        i2 = i13;
                        org.objectweb.asm.Attribute attribute2 = attribute;
                        attribute = readAttribute(context2.attributePrototypes, utf11, i2, i12, cArr, -1, null);
                        attribute.nextAttribute = attribute2;
                        i9 = i9;
                        i10 = i10;
                        i7 = i7;
                        i8 = i8;
                    }
                    i5 = i2 + i12;
                    context2 = context;
                    unsignedShort2 = i11;
                }
                i6 = i3;
            }
            i2 = i13;
            i5 = i2 + i12;
            context2 = context;
            unsignedShort2 = i11;
        }
        org.objectweb.asm.Attribute attribute3 = attribute;
        int i14 = i7;
        int i15 = i8;
        int i16 = i9;
        int i17 = i10;
        org.objectweb.asm.FieldVisitor fieldVisitorVisitField = classVisitor.visitField(i6, utf8, utf9, utf10, obj);
        if (fieldVisitorVisitField == null) {
            return i5;
        }
        if (i17 != 0) {
            int unsignedShort4 = readUnsignedShort(i17);
            int elementValues = i17 + 2;
            while (true) {
                int i18 = unsignedShort4 - 1;
                if (unsignedShort4 <= 0) {
                    break;
                }
                elementValues = readElementValues(fieldVisitorVisitField.visitAnnotation(readUTF8(elementValues, cArr), true), elementValues + 2, true, cArr);
                unsignedShort4 = i18;
            }
        }
        if (i16 != 0) {
            int unsignedShort5 = readUnsignedShort(i16);
            int elementValues2 = i16 + 2;
            while (true) {
                int i19 = unsignedShort5 - 1;
                if (unsignedShort5 <= 0) {
                    break;
                }
                elementValues2 = readElementValues(fieldVisitorVisitField.visitAnnotation(readUTF8(elementValues2, cArr), false), elementValues2 + 2, true, cArr);
                unsignedShort5 = i19;
            }
        }
        if (i15 != 0) {
            int unsignedShort6 = readUnsignedShort(i15);
            int elementValues3 = i15 + 2;
            while (true) {
                int i20 = unsignedShort6 - 1;
                if (unsignedShort6 <= 0) {
                    break;
                }
                int typeAnnotationTarget = readTypeAnnotationTarget(context, elementValues3);
                elementValues3 = readElementValues(fieldVisitorVisitField.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, readUTF8(typeAnnotationTarget, cArr), true), typeAnnotationTarget + 2, true, cArr);
                unsignedShort6 = i20;
            }
        }
        if (i14 != 0) {
            int unsignedShort7 = readUnsignedShort(i14);
            int elementValues4 = i14 + 2;
            while (true) {
                int i21 = unsignedShort7 - 1;
                if (unsignedShort7 <= 0) {
                    break;
                }
                int typeAnnotationTarget2 = readTypeAnnotationTarget(context, elementValues4);
                elementValues4 = readElementValues(fieldVisitorVisitField.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, readUTF8(typeAnnotationTarget2, cArr), false), typeAnnotationTarget2 + 2, true, cArr);
                unsignedShort7 = i21;
            }
        }
        while (true) {
            org.objectweb.asm.Attribute attribute4 = attribute3;
            if (attribute4 != null) {
                attribute3 = attribute4.nextAttribute;
                attribute4.nextAttribute = null;
                fieldVisitorVisitField.visitAttribute(attribute4);
            } else {
                fieldVisitorVisitField.visitEnd();
                return i5;
            }
        }
    }

    private int readMethod(org.objectweb.asm.ClassVisitor classVisitor, org.objectweb.asm.Context context, int i) {
        int i2;
        int i3;
        int i4;
        char[] cArr = context.charBuffer;
        context.currentMethodAccessFlags = readUnsignedShort(i);
        context.currentMethodName = readUTF8(i + 2, cArr);
        int i5 = i + 4;
        context.currentMethodDescriptor = readUTF8(i5, cArr);
        int i6 = i + 6;
        int unsignedShort = readUnsignedShort(i6);
        int i7 = i6 + 2;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int unsignedShort2 = 0;
        org.objectweb.asm.Attribute attribute = null;
        boolean z = false;
        int i13 = 0;
        java.lang.String[] strArr = null;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            int i18 = unsignedShort - 1;
            if (unsignedShort <= 0) {
                break;
            }
            java.lang.String utf8 = readUTF8(i7, cArr);
            int i19 = readInt(i7 + 2);
            int i20 = i7 + 6;
            i8 = i8;
            if ("Code".equals(utf8)) {
                if ((context.parsingOptions & 1) == 0) {
                    i17 = i20;
                    i8 = i8;
                    i4 = i17;
                } else {
                    i2 = i9;
                    i3 = i10;
                    i9 = i2;
                    i10 = i3;
                    i4 = i20;
                }
            } else if ("Exceptions".equals(utf8)) {
                int unsignedShort3 = readUnsignedShort(i20);
                java.lang.String[] strArr2 = new java.lang.String[unsignedShort3];
                int i21 = i9;
                int i22 = i10;
                int i23 = i20 + 2;
                for (int i24 = 0; i24 < unsignedShort3; i24++) {
                    strArr2[i24] = readClass(i23, cArr);
                    i23 += 2;
                }
                strArr = strArr2;
                i13 = i20;
                i8 = i8;
                i9 = i21;
                i10 = i22;
                i4 = i13;
            } else {
                i2 = i9;
                i3 = i10;
                if ("Signature".equals(utf8)) {
                    unsignedShort2 = readUnsignedShort(i20);
                } else if ("Deprecated".equals(utf8)) {
                    context.currentMethodAccessFlags |= 131072;
                } else if ("RuntimeVisibleAnnotations".equals(utf8)) {
                    i10 = i20;
                    i8 = i8;
                    i9 = i2;
                    i4 = i10;
                } else if ("RuntimeVisibleTypeAnnotations".equals(utf8)) {
                    i8 = i20;
                    i4 = i8;
                    i9 = i2;
                    i10 = i3;
                } else if ("AnnotationDefault".equals(utf8)) {
                    i11 = i20;
                    i8 = i8;
                    i9 = i2;
                    i10 = i3;
                    i4 = i11;
                } else if ("Synthetic".equals(utf8)) {
                    context.currentMethodAccessFlags |= 4096;
                    i9 = i2;
                    i10 = i3;
                    z = true;
                    i4 = i20;
                } else if ("RuntimeInvisibleAnnotations".equals(utf8)) {
                    i9 = i20;
                    i8 = i8;
                    i10 = i3;
                    i4 = i9;
                } else if ("RuntimeInvisibleTypeAnnotations".equals(utf8)) {
                    i14 = i20;
                    i8 = i8;
                    i9 = i2;
                    i10 = i3;
                    i4 = i14;
                } else if ("RuntimeVisibleParameterAnnotations".equals(utf8)) {
                    i15 = i20;
                    i8 = i8;
                    i9 = i2;
                    i10 = i3;
                    i4 = i15;
                } else if ("RuntimeInvisibleParameterAnnotations".equals(utf8)) {
                    i16 = i20;
                    i8 = i8;
                    i9 = i2;
                    i10 = i3;
                    i4 = i16;
                } else if ("MethodParameters".equals(utf8)) {
                    i12 = i20;
                    i8 = i8;
                    i9 = i2;
                    i10 = i3;
                    i4 = i12;
                } else {
                    i4 = i20;
                    org.objectweb.asm.Attribute attribute2 = readAttribute(context.attributePrototypes, utf8, i20, i19, cArr, -1, null);
                    attribute2.nextAttribute = attribute;
                    attribute = attribute2;
                    unsignedShort2 = unsignedShort2;
                    i9 = i2;
                    i10 = i3;
                    i8 = i8;
                    i11 = i11;
                    i12 = i12;
                }
                i9 = i2;
                i10 = i3;
                i4 = i20;
            }
            i7 = i4 + i19;
            unsignedShort = i18;
        }
        int i25 = i8;
        int i26 = i9;
        int i27 = i10;
        int i28 = i11;
        int i29 = i12;
        int i30 = unsignedShort2;
        org.objectweb.asm.MethodVisitor methodVisitorVisitMethod = classVisitor.visitMethod(context.currentMethodAccessFlags, context.currentMethodName, context.currentMethodDescriptor, i30 == 0 ? null : readUtf(i30, cArr), strArr);
        if (methodVisitorVisitMethod == null) {
            return i7;
        }
        if (methodVisitorVisitMethod instanceof org.objectweb.asm.MethodWriter) {
            org.objectweb.asm.MethodWriter methodWriter = (org.objectweb.asm.MethodWriter) methodVisitorVisitMethod;
            if (methodWriter.canCopyMethodAttributes(this, z, (context.currentMethodAccessFlags & 131072) != 0, readUnsignedShort(i5), i30, i13)) {
                methodWriter.setMethodAttributesSource(i, i7 - i);
                return i7;
            }
        }
        if (i29 != 0 && (context.parsingOptions & 2) == 0) {
            int i31 = readByte(i29);
            int i32 = i29 + 1;
            while (true) {
                int i33 = i31 - 1;
                if (i31 <= 0) {
                    break;
                }
                methodVisitorVisitMethod.visitParameter(readUTF8(i32, cArr), readUnsignedShort(i32 + 2));
                i32 += 4;
                i31 = i33;
            }
        }
        if (i28 != 0) {
            org.objectweb.asm.AnnotationVisitor annotationVisitorVisitAnnotationDefault = methodVisitorVisitMethod.visitAnnotationDefault();
            readElementValue(annotationVisitorVisitAnnotationDefault, i28, null, cArr);
            if (annotationVisitorVisitAnnotationDefault != null) {
                annotationVisitorVisitAnnotationDefault.visitEnd();
            }
        }
        if (i27 != 0) {
            int unsignedShort4 = readUnsignedShort(i27);
            int elementValues = i27 + 2;
            while (true) {
                int i34 = unsignedShort4 - 1;
                if (unsignedShort4 <= 0) {
                    break;
                }
                elementValues = readElementValues(methodVisitorVisitMethod.visitAnnotation(readUTF8(elementValues, cArr), true), elementValues + 2, true, cArr);
                unsignedShort4 = i34;
            }
        }
        if (i26 != 0) {
            int unsignedShort5 = readUnsignedShort(i26);
            int elementValues2 = i26 + 2;
            while (true) {
                int i35 = unsignedShort5 - 1;
                if (unsignedShort5 <= 0) {
                    break;
                }
                elementValues2 = readElementValues(methodVisitorVisitMethod.visitAnnotation(readUTF8(elementValues2, cArr), false), elementValues2 + 2, true, cArr);
                unsignedShort5 = i35;
            }
        }
        if (i25 != 0) {
            int unsignedShort6 = readUnsignedShort(i25);
            int elementValues3 = i25 + 2;
            while (true) {
                int i36 = unsignedShort6 - 1;
                if (unsignedShort6 <= 0) {
                    break;
                }
                int typeAnnotationTarget = readTypeAnnotationTarget(context, elementValues3);
                elementValues3 = readElementValues(methodVisitorVisitMethod.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, readUTF8(typeAnnotationTarget, cArr), true), typeAnnotationTarget + 2, true, cArr);
                unsignedShort6 = i36;
            }
        }
        int i37 = i14;
        if (i37 != 0) {
            int unsignedShort7 = readUnsignedShort(i37);
            int elementValues4 = i37 + 2;
            while (true) {
                int i38 = unsignedShort7 - 1;
                if (unsignedShort7 <= 0) {
                    break;
                }
                int typeAnnotationTarget2 = readTypeAnnotationTarget(context, elementValues4);
                elementValues4 = readElementValues(methodVisitorVisitMethod.visitTypeAnnotation(context.currentTypeAnnotationTarget, context.currentTypeAnnotationTargetPath, readUTF8(typeAnnotationTarget2, cArr), false), typeAnnotationTarget2 + 2, true, cArr);
                unsignedShort7 = i38;
            }
        }
        int i39 = i15;
        if (i39 != 0) {
            readParameterAnnotations(methodVisitorVisitMethod, context, i39, true);
        }
        int i40 = i16;
        if (i40 != 0) {
            readParameterAnnotations(methodVisitorVisitMethod, context, i40, false);
        }
        while (attribute != null) {
            org.objectweb.asm.Attribute attribute3 = attribute.nextAttribute;
            attribute.nextAttribute = null;
            methodVisitorVisitMethod.visitAttribute(attribute);
            attribute = attribute3;
        }
        int i41 = i17;
        if (i41 != 0) {
            methodVisitorVisitMethod.visitCode();
            readCode(methodVisitorVisitMethod, context, i41);
        }
        methodVisitorVisitMethod.visitEnd();
        return i7;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 34301. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    private void readCode(org.objectweb.asm.MethodVisitor r41, org.objectweb.asm.Context r42, int r43) {
        /*
            Method dump skipped, instruction units count: 3430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.ClassReader.readCode(org.objectweb.asm.MethodVisitor, org.objectweb.asm.Context, int):void");
    }

    protected org.objectweb.asm.Label readLabel(int i, org.objectweb.asm.Label[] labelArr) {
        if (labelArr[i] == null) {
            labelArr[i] = new org.objectweb.asm.Label();
        }
        return labelArr[i];
    }

    private org.objectweb.asm.Label createLabel(int i, org.objectweb.asm.Label[] labelArr) {
        org.objectweb.asm.Label label = readLabel(i, labelArr);
        label.flags = (short) (label.flags & (-2));
        return label;
    }

    private void createDebugLabel(int i, org.objectweb.asm.Label[] labelArr) {
        if (labelArr[i] == null) {
            org.objectweb.asm.Label label = readLabel(i, labelArr);
            label.flags = (short) (label.flags | 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004d A[FALL_THROUGH] */
    private int[] readTypeAnnotations(org.objectweb.asm.MethodVisitor methodVisitor, org.objectweb.asm.Context context, int i, boolean z) {
        int i2;
        char[] cArr = context.charBuffer;
        int unsignedShort = readUnsignedShort(i);
        int[] iArr = new int[unsignedShort];
        int elementValues = i + 2;
        for (int i3 = 0; i3 < unsignedShort; i3++) {
            iArr[i3] = elementValues;
            int i4 = readInt(elementValues);
            int i5 = i4 >>> 24;
            if (i5 != 23) {
                switch (i5) {
                    default:
                        switch (i5) {
                            case 64:
                            case 65:
                                int unsignedShort2 = readUnsignedShort(elementValues + 1);
                                i2 = elementValues + 3;
                                while (true) {
                                    int i6 = unsignedShort2 - 1;
                                    if (unsignedShort2 > 0) {
                                        int unsignedShort3 = readUnsignedShort(i2);
                                        int unsignedShort4 = readUnsignedShort(i2 + 2);
                                        i2 += 6;
                                        createLabel(unsignedShort3, context.currentMethodLabels);
                                        createLabel(unsignedShort3 + unsignedShort4, context.currentMethodLabels);
                                        unsignedShort2 = i6;
                                    }
                                    break;
                                }
                                break;
                            case 66:
                            case 67:
                            case 68:
                            case 69:
                            case 70:
                                break;
                            case 71:
                            case 72:
                            case 73:
                            case 74:
                            case 75:
                                i2 = elementValues + 4;
                                break;
                            default:
                                throw new java.lang.IllegalArgumentException();
                        }
                    case 16:
                    case 17:
                    case 18:
                        i2 = elementValues + 3;
                        break;
                }
            } else {
                i2 = elementValues + 3;
            }
            int i7 = readByte(i2);
            if (i5 == 66) {
                org.objectweb.asm.TypePath typePath = i7 != 0 ? new org.objectweb.asm.TypePath(this.classFileBuffer, i2) : null;
                int i8 = i2 + (i7 * 2) + 1;
                elementValues = readElementValues(methodVisitor.visitTryCatchAnnotation(i4 & androidx.core.view.InputDeviceCompat.SOURCE_ANY, typePath, readUTF8(i8, cArr), z), i8 + 2, true, cArr);
            } else {
                elementValues = readElementValues(null, i2 + (i7 * 2) + 3, true, cArr);
            }
        }
        return iArr;
    }

    private int getTypeAnnotationBytecodeOffset(int[] iArr, int i) {
        if (iArr == null || i >= iArr.length || readByte(iArr[i]) < 67) {
            return -1;
        }
        return readUnsignedShort(iArr[i] + 1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:16:0x006b  */
    /* JADX WARN: Code duplicated, block: B:18:0x0070  */
    private int readTypeAnnotationTarget(org.objectweb.asm.Context context, int i) {
        int i2;
        int i3;
        int i4 = readInt(i);
        int i5 = i4 >>> 24;
        if (i5 != 0 && i5 != 1) {
            switch (i5) {
                case 16:
                case 17:
                case 18:
                case 23:
                    i2 = i4 & androidx.core.view.InputDeviceCompat.SOURCE_ANY;
                    i3 = i + 3;
                    break;
                case 19:
                case 20:
                case 21:
                    i2 = i4 & androidx.core.view.ViewCompat.MEASURED_STATE_MASK;
                    i3 = i + 1;
                    break;
                case 22:
                    i2 = i4 & (-65536);
                    i3 = i + 2;
                    break;
                default:
                    switch (i5) {
                        case 64:
                        case 65:
                            i2 = i4 & androidx.core.view.ViewCompat.MEASURED_STATE_MASK;
                            int unsignedShort = readUnsignedShort(i + 1);
                            i3 = i + 3;
                            context.currentLocalVariableAnnotationRangeStarts = new org.objectweb.asm.Label[unsignedShort];
                            context.currentLocalVariableAnnotationRangeEnds = new org.objectweb.asm.Label[unsignedShort];
                            context.currentLocalVariableAnnotationRangeIndices = new int[unsignedShort];
                            for (int i6 = 0; i6 < unsignedShort; i6++) {
                                int unsignedShort2 = readUnsignedShort(i3);
                                int unsignedShort3 = readUnsignedShort(i3 + 2);
                                int unsignedShort4 = readUnsignedShort(i3 + 4);
                                i3 += 6;
                                context.currentLocalVariableAnnotationRangeStarts[i6] = createLabel(unsignedShort2, context.currentMethodLabels);
                                context.currentLocalVariableAnnotationRangeEnds[i6] = createLabel(unsignedShort2 + unsignedShort3, context.currentMethodLabels);
                                context.currentLocalVariableAnnotationRangeIndices[i6] = unsignedShort4;
                            }
                            break;
                        case 66:
                            i2 = i4 & androidx.core.view.InputDeviceCompat.SOURCE_ANY;
                            i3 = i + 3;
                            break;
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                            i2 = i4 & androidx.core.view.ViewCompat.MEASURED_STATE_MASK;
                            i3 = i + 3;
                            break;
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                            i2 = i4 & (-16776961);
                            i3 = i + 4;
                            break;
                        default:
                            throw new java.lang.IllegalArgumentException();
                    }
                    break;
            }
        } else {
            i2 = i4 & (-65536);
            i3 = i + 2;
        }
        context.currentTypeAnnotationTarget = i2;
        int i7 = readByte(i3);
        context.currentTypeAnnotationTargetPath = i7 == 0 ? null : new org.objectweb.asm.TypePath(this.classFileBuffer, i3);
        return i3 + 1 + (i7 * 2);
    }

    private void readParameterAnnotations(org.objectweb.asm.MethodVisitor methodVisitor, org.objectweb.asm.Context context, int i, boolean z) {
        int elementValues = i + 1;
        int i2 = this.classFileBuffer[i] & 255;
        methodVisitor.visitAnnotableParameterCount(i2, z);
        char[] cArr = context.charBuffer;
        for (int i3 = 0; i3 < i2; i3++) {
            int unsignedShort = readUnsignedShort(elementValues);
            elementValues += 2;
            while (true) {
                int i4 = unsignedShort - 1;
                if (unsignedShort > 0) {
                    elementValues = readElementValues(methodVisitor.visitParameterAnnotation(i3, readUTF8(elementValues, cArr), z), elementValues + 2, true, cArr);
                    unsignedShort = i4;
                }
            }
        }
    }

    private int readElementValues(org.objectweb.asm.AnnotationVisitor annotationVisitor, int i, boolean z, char[] cArr) {
        int unsignedShort = readUnsignedShort(i);
        int elementValue = i + 2;
        if (!z) {
            while (true) {
                int i2 = unsignedShort - 1;
                if (unsignedShort <= 0) {
                    break;
                }
                elementValue = readElementValue(annotationVisitor, elementValue, null, cArr);
                unsignedShort = i2;
            }
        } else {
            while (true) {
                int i3 = unsignedShort - 1;
                if (unsignedShort <= 0) {
                    break;
                }
                elementValue = readElementValue(annotationVisitor, elementValue + 2, readUTF8(elementValue, cArr), cArr);
                unsignedShort = i3;
            }
        }
        if (annotationVisitor != null) {
            annotationVisitor.visitEnd();
        }
        return elementValue;
    }

    /* JADX WARN: Code duplicated, block: B:97:0x0210  */
    private int readElementValue(org.objectweb.asm.AnnotationVisitor annotationVisitor, int i, java.lang.String str, char[] cArr) {
        java.lang.Object obj;
        int i2 = 0;
        if (annotationVisitor == null) {
            int i3 = this.classFileBuffer[i] & 255;
            if (i3 == 64) {
                return readElementValues(null, i + 3, true, cArr);
            }
            if (i3 != 91) {
                return i3 != 101 ? i + 3 : i + 5;
            }
            return readElementValues(null, i + 1, false, cArr);
        }
        int i4 = i + 1;
        int i5 = this.classFileBuffer[i] & 255;
        if (i5 == 64) {
            return readElementValues(annotationVisitor.visitAnnotation(str, readUTF8(i4, cArr)), i4 + 2, true, cArr);
        }
        if (i5 == 70) {
            annotationVisitor.visit(str, readConst(readUnsignedShort(i4), cArr));
        } else if (i5 == 83) {
            annotationVisitor.visit(str, java.lang.Short.valueOf((short) readInt(this.cpInfoOffsets[readUnsignedShort(i4)])));
        } else if (i5 == 99) {
            annotationVisitor.visit(str, org.objectweb.asm.Type.getType(readUTF8(i4, cArr)));
        } else {
            if (i5 == 101) {
                annotationVisitor.visitEnum(str, readUTF8(i4, cArr), readUTF8(i4 + 2, cArr));
                return i4 + 4;
            }
            if (i5 == 115) {
                annotationVisitor.visit(str, readUTF8(i4, cArr));
            } else if (i5 == 73 || i5 == 74) {
                annotationVisitor.visit(str, readConst(readUnsignedShort(i4), cArr));
            } else if (i5 == 90) {
                if (readInt(this.cpInfoOffsets[readUnsignedShort(i4)]) == 0) {
                    obj = java.lang.Boolean.FALSE;
                } else {
                    obj = java.lang.Boolean.TRUE;
                }
                annotationVisitor.visit(str, obj);
            } else if (i5 != 91) {
                switch (i5) {
                    case 66:
                        annotationVisitor.visit(str, java.lang.Byte.valueOf((byte) readInt(this.cpInfoOffsets[readUnsignedShort(i4)])));
                        break;
                    case 67:
                        annotationVisitor.visit(str, java.lang.Character.valueOf((char) readInt(this.cpInfoOffsets[readUnsignedShort(i4)])));
                        break;
                    case 68:
                        annotationVisitor.visit(str, readConst(readUnsignedShort(i4), cArr));
                        break;
                    default:
                        throw new java.lang.IllegalArgumentException();
                }
            } else {
                int unsignedShort = readUnsignedShort(i4);
                int i6 = i4 + 2;
                if (unsignedShort == 0) {
                    return readElementValues(annotationVisitor.visitArray(str), i6 - 2, false, cArr);
                }
                int i7 = this.classFileBuffer[i6] & 255;
                if (i7 == 70) {
                    float[] fArr = new float[unsignedShort];
                    while (i2 < unsignedShort) {
                        fArr[i2] = java.lang.Float.intBitsToFloat(readInt(this.cpInfoOffsets[readUnsignedShort(i6 + 1)]));
                        i6 += 3;
                        i2++;
                    }
                    annotationVisitor.visit(str, fArr);
                    return i6;
                }
                if (i7 == 83) {
                    short[] sArr = new short[unsignedShort];
                    while (i2 < unsignedShort) {
                        sArr[i2] = (short) readInt(this.cpInfoOffsets[readUnsignedShort(i6 + 1)]);
                        i6 += 3;
                        i2++;
                    }
                    annotationVisitor.visit(str, sArr);
                    return i6;
                }
                if (i7 == 90) {
                    boolean[] zArr = new boolean[unsignedShort];
                    for (int i8 = 0; i8 < unsignedShort; i8++) {
                        zArr[i8] = readInt(this.cpInfoOffsets[readUnsignedShort(i6 + 1)]) != 0;
                        i6 += 3;
                    }
                    annotationVisitor.visit(str, zArr);
                    return i6;
                }
                if (i7 == 73) {
                    int[] iArr = new int[unsignedShort];
                    while (i2 < unsignedShort) {
                        iArr[i2] = readInt(this.cpInfoOffsets[readUnsignedShort(i6 + 1)]);
                        i6 += 3;
                        i2++;
                    }
                    annotationVisitor.visit(str, iArr);
                    return i6;
                }
                if (i7 != 74) {
                    switch (i7) {
                        case 66:
                            byte[] bArr = new byte[unsignedShort];
                            while (i2 < unsignedShort) {
                                bArr[i2] = (byte) readInt(this.cpInfoOffsets[readUnsignedShort(i6 + 1)]);
                                i6 += 3;
                                i2++;
                            }
                            annotationVisitor.visit(str, bArr);
                            return i6;
                        case 67:
                            char[] cArr2 = new char[unsignedShort];
                            while (i2 < unsignedShort) {
                                cArr2[i2] = (char) readInt(this.cpInfoOffsets[readUnsignedShort(i6 + 1)]);
                                i6 += 3;
                                i2++;
                            }
                            annotationVisitor.visit(str, cArr2);
                            return i6;
                        case 68:
                            double[] dArr = new double[unsignedShort];
                            while (i2 < unsignedShort) {
                                dArr[i2] = java.lang.Double.longBitsToDouble(readLong(this.cpInfoOffsets[readUnsignedShort(i6 + 1)]));
                                i6 += 3;
                                i2++;
                            }
                            annotationVisitor.visit(str, dArr);
                            return i6;
                        default:
                            return readElementValues(annotationVisitor.visitArray(str), i6 - 2, false, cArr);
                    }
                }
                long[] jArr = new long[unsignedShort];
                while (i2 < unsignedShort) {
                    jArr[i2] = readLong(this.cpInfoOffsets[readUnsignedShort(i6 + 1)]);
                    i6 += 3;
                    i2++;
                }
                annotationVisitor.visit(str, jArr);
                return i6;
            }
        }
        return i4 + 2;
    }

    private void computeImplicitFrame(org.objectweb.asm.Context context) {
        int i;
        java.lang.String str = context.currentMethodDescriptor;
        java.lang.Object[] objArr = context.currentFrameLocalTypes;
        int i2 = 0;
        if ((context.currentMethodAccessFlags & 8) == 0) {
            if ("<init>".equals(context.currentMethodName)) {
                objArr[0] = org.objectweb.asm.Opcodes.UNINITIALIZED_THIS;
            } else {
                objArr[0] = readClass(this.header + 2, context.charBuffer);
            }
            i2 = 1;
        }
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt = str.charAt(i3);
            if (cCharAt == 'F') {
                i = i2 + 1;
                objArr[i2] = org.objectweb.asm.Opcodes.FLOAT;
            } else if (cCharAt != 'L') {
                if (cCharAt != 'S' && cCharAt != 'I') {
                    if (cCharAt == 'J') {
                        i = i2 + 1;
                        objArr[i2] = org.objectweb.asm.Opcodes.LONG;
                    } else if (cCharAt != 'Z') {
                        if (cCharAt != '[') {
                            switch (cCharAt) {
                                case 'B':
                                case 'C':
                                    break;
                                case 'D':
                                    i = i2 + 1;
                                    objArr[i2] = org.objectweb.asm.Opcodes.DOUBLE;
                                    break;
                                default:
                                    context.currentFrameLocalCount = i2;
                                    return;
                            }
                        } else {
                            while (str.charAt(i4) == '[') {
                                i4++;
                            }
                            if (str.charAt(i4) == 'L') {
                                do {
                                    i4++;
                                } while (str.charAt(i4) != ';');
                            }
                            int i5 = i4 + 1;
                            objArr[i2] = str.substring(i3, i5);
                            i3 = i5;
                            i2++;
                        }
                    }
                }
                i = i2 + 1;
                objArr[i2] = org.objectweb.asm.Opcodes.INTEGER;
            } else {
                int i6 = i4;
                while (str.charAt(i6) != ';') {
                    i6++;
                }
                objArr[i2] = str.substring(i4, i6);
                i2++;
                i3 = i6 + 1;
            }
            i2 = i;
            i3 = i4;
        }
    }

    private int readStackMapFrame(int i, boolean z, boolean z2, org.objectweb.asm.Context context) {
        int verificationTypeInfo;
        int i2;
        char[] cArr = context.charBuffer;
        org.objectweb.asm.Label[] labelArr = context.currentMethodLabels;
        if (z) {
            verificationTypeInfo = i + 1;
            i2 = this.classFileBuffer[i] & 255;
        } else {
            context.currentFrameOffset = -1;
            verificationTypeInfo = i;
            i2 = 255;
        }
        context.currentFrameLocalCountDelta = 0;
        if (i2 < 64) {
            context.currentFrameType = 3;
            context.currentFrameStackCount = 0;
        } else if (i2 < 128) {
            i2 -= 64;
            verificationTypeInfo = readVerificationTypeInfo(verificationTypeInfo, context.currentFrameStackTypes, 0, cArr, labelArr);
            context.currentFrameType = 4;
            context.currentFrameStackCount = 1;
        } else if (i2 >= 247) {
            int unsignedShort = readUnsignedShort(verificationTypeInfo);
            verificationTypeInfo += 2;
            if (i2 == 247) {
                verificationTypeInfo = readVerificationTypeInfo(verificationTypeInfo, context.currentFrameStackTypes, 0, cArr, labelArr);
                context.currentFrameType = 4;
                context.currentFrameStackCount = 1;
            } else if (i2 >= 248 && i2 < 251) {
                context.currentFrameType = 2;
                context.currentFrameLocalCountDelta = 251 - i2;
                context.currentFrameLocalCount -= context.currentFrameLocalCountDelta;
                context.currentFrameStackCount = 0;
            } else if (i2 == 251) {
                context.currentFrameType = 3;
                context.currentFrameStackCount = 0;
            } else if (i2 < 255) {
                int i3 = i2 - 251;
                int i4 = z2 ? context.currentFrameLocalCount : 0;
                int i5 = i3;
                while (i5 > 0) {
                    verificationTypeInfo = readVerificationTypeInfo(verificationTypeInfo, context.currentFrameLocalTypes, i4, cArr, labelArr);
                    i5--;
                    i4++;
                }
                context.currentFrameType = 1;
                context.currentFrameLocalCountDelta = i3;
                context.currentFrameLocalCount += context.currentFrameLocalCountDelta;
                context.currentFrameStackCount = 0;
            } else {
                int unsignedShort2 = readUnsignedShort(verificationTypeInfo);
                int verificationTypeInfo2 = verificationTypeInfo + 2;
                context.currentFrameType = 0;
                context.currentFrameLocalCountDelta = unsignedShort2;
                context.currentFrameLocalCount = unsignedShort2;
                for (int i6 = 0; i6 < unsignedShort2; i6++) {
                    verificationTypeInfo2 = readVerificationTypeInfo(verificationTypeInfo2, context.currentFrameLocalTypes, i6, cArr, labelArr);
                }
                int unsignedShort3 = readUnsignedShort(verificationTypeInfo2);
                verificationTypeInfo = verificationTypeInfo2 + 2;
                context.currentFrameStackCount = unsignedShort3;
                for (int i7 = 0; i7 < unsignedShort3; i7++) {
                    verificationTypeInfo = readVerificationTypeInfo(verificationTypeInfo, context.currentFrameStackTypes, i7, cArr, labelArr);
                }
            }
            i2 = unsignedShort;
        } else {
            throw new java.lang.IllegalArgumentException();
        }
        context.currentFrameOffset += i2 + 1;
        createLabel(context.currentFrameOffset, labelArr);
        return verificationTypeInfo;
    }

    private int readVerificationTypeInfo(int i, java.lang.Object[] objArr, int i2, char[] cArr, org.objectweb.asm.Label[] labelArr) {
        int i3 = i + 1;
        switch (this.classFileBuffer[i] & 255) {
            case 0:
                objArr[i2] = org.objectweb.asm.Opcodes.TOP;
                return i3;
            case 1:
                objArr[i2] = org.objectweb.asm.Opcodes.INTEGER;
                return i3;
            case 2:
                objArr[i2] = org.objectweb.asm.Opcodes.FLOAT;
                return i3;
            case 3:
                objArr[i2] = org.objectweb.asm.Opcodes.DOUBLE;
                return i3;
            case 4:
                objArr[i2] = org.objectweb.asm.Opcodes.LONG;
                return i3;
            case 5:
                objArr[i2] = org.objectweb.asm.Opcodes.NULL;
                return i3;
            case 6:
                objArr[i2] = org.objectweb.asm.Opcodes.UNINITIALIZED_THIS;
                return i3;
            case 7:
                objArr[i2] = readClass(i3, cArr);
                break;
            case 8:
                objArr[i2] = createLabel(readUnsignedShort(i3), labelArr);
                break;
            default:
                throw new java.lang.IllegalArgumentException();
        }
        return i3 + 2;
    }

    final int getFirstAttributeOffset() {
        int i = this.header;
        int unsignedShort = i + 8 + (readUnsignedShort(i + 6) * 2);
        int unsignedShort2 = readUnsignedShort(unsignedShort);
        int i2 = unsignedShort + 2;
        while (true) {
            int i3 = unsignedShort2 - 1;
            if (unsignedShort2 <= 0) {
                break;
            }
            int unsignedShort3 = readUnsignedShort(i2 + 6);
            i2 += 8;
            while (true) {
                int i4 = unsignedShort3 - 1;
                if (unsignedShort3 > 0) {
                    i2 += readInt(i2 + 2) + 6;
                    unsignedShort3 = i4;
                }
            }
            unsignedShort2 = i3;
        }
        int unsignedShort4 = readUnsignedShort(i2);
        int i5 = i2 + 2;
        while (true) {
            int i6 = unsignedShort4 - 1;
            if (unsignedShort4 <= 0) {
                return i5 + 2;
            }
            int unsignedShort5 = readUnsignedShort(i5 + 6);
            i5 += 8;
            while (true) {
                int i7 = unsignedShort5 - 1;
                if (unsignedShort5 > 0) {
                    i5 += readInt(i5 + 2) + 6;
                    unsignedShort5 = i7;
                }
            }
            unsignedShort4 = i6;
        }
    }

    private int[] readBootstrapMethodsAttribute(int i) {
        char[] cArr = new char[i];
        int firstAttributeOffset = getFirstAttributeOffset();
        for (int unsignedShort = readUnsignedShort(firstAttributeOffset - 2); unsignedShort > 0; unsignedShort--) {
            java.lang.String utf8 = readUTF8(firstAttributeOffset, cArr);
            int i2 = readInt(firstAttributeOffset + 2);
            int i3 = firstAttributeOffset + 6;
            if ("BootstrapMethods".equals(utf8)) {
                int unsignedShort2 = readUnsignedShort(i3);
                int[] iArr = new int[unsignedShort2];
                int unsignedShort3 = i3 + 2;
                for (int i4 = 0; i4 < unsignedShort2; i4++) {
                    iArr[i4] = unsignedShort3;
                    unsignedShort3 += (readUnsignedShort(unsignedShort3 + 2) * 2) + 4;
                }
                return iArr;
            }
            firstAttributeOffset = i3 + i2;
        }
        throw new java.lang.IllegalArgumentException();
    }

    private org.objectweb.asm.Attribute readAttribute(org.objectweb.asm.Attribute[] attributeArr, java.lang.String str, int i, int i2, char[] cArr, int i3, org.objectweb.asm.Label[] labelArr) {
        for (org.objectweb.asm.Attribute attribute : attributeArr) {
            if (attribute.type.equals(str)) {
                return attribute.read(this, i, i2, cArr, i3, labelArr);
            }
        }
        return new org.objectweb.asm.Attribute(str).read(this, i, i2, null, -1, null);
    }

    public int getItemCount() {
        return this.cpInfoOffsets.length;
    }

    public int getItem(int i) {
        return this.cpInfoOffsets[i];
    }

    public int getMaxStringLength() {
        return this.maxStringLength;
    }

    public int readByte(int i) {
        return this.classFileBuffer[i] & 255;
    }

    public int readUnsignedShort(int i) {
        byte[] bArr = this.classFileBuffer;
        return (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
    }

    public short readShort(int i) {
        byte[] bArr = this.classFileBuffer;
        return (short) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    public int readInt(int i) {
        byte[] bArr = this.classFileBuffer;
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public long readLong(int i) {
        return (((long) readInt(i)) << 32) | (((long) readInt(i + 4)) & androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE);
    }

    public java.lang.String readUTF8(int i, char[] cArr) {
        int unsignedShort = readUnsignedShort(i);
        if (i == 0 || unsignedShort == 0) {
            return null;
        }
        return readUtf(unsignedShort, cArr);
    }

    final java.lang.String readUtf(int i, char[] cArr) {
        java.lang.String[] strArr = this.constantUtf8Values;
        java.lang.String str = strArr[i];
        if (str != null) {
            return str;
        }
        int i2 = this.cpInfoOffsets[i];
        java.lang.String utf = readUtf(i2 + 2, readUnsignedShort(i2), cArr);
        strArr[i] = utf;
        return utf;
    }

    private java.lang.String readUtf(int i, int i2, char[] cArr) {
        int i3;
        int i4 = i2 + i;
        byte[] bArr = this.classFileBuffer;
        int i5 = 0;
        while (i < i4) {
            int i6 = i + 1;
            byte b = bArr[i];
            if ((b & 128) == 0) {
                i3 = i5 + 1;
                cArr[i5] = (char) (b & 127);
            } else if ((b & 224) == 192) {
                cArr[i5] = (char) (((b & 31) << 6) + (bArr[i6] & okio.Utf8.REPLACEMENT_BYTE));
                i5++;
                i = i6 + 1;
            } else {
                i3 = i5 + 1;
                int i7 = i6 + 1;
                int i8 = ((b & 15) << 12) + ((bArr[i6] & okio.Utf8.REPLACEMENT_BYTE) << 6);
                i6 = i7 + 1;
                cArr[i5] = (char) (i8 + (bArr[i7] & okio.Utf8.REPLACEMENT_BYTE));
            }
            i = i6;
            i5 = i3;
        }
        return new java.lang.String(cArr, 0, i5);
    }

    private java.lang.String readStringish(int i, char[] cArr) {
        return readUTF8(this.cpInfoOffsets[readUnsignedShort(i)], cArr);
    }

    public java.lang.String readClass(int i, char[] cArr) {
        return readStringish(i, cArr);
    }

    public java.lang.String readModule(int i, char[] cArr) {
        return readStringish(i, cArr);
    }

    public java.lang.String readPackage(int i, char[] cArr) {
        return readStringish(i, cArr);
    }

    private org.objectweb.asm.ConstantDynamic readConstantDynamic(int i, char[] cArr) {
        org.objectweb.asm.ConstantDynamic constantDynamic = this.constantDynamicValues[i];
        if (constantDynamic != null) {
            return constantDynamic;
        }
        int[] iArr = this.cpInfoOffsets;
        int i2 = iArr[i];
        int i3 = iArr[readUnsignedShort(i2 + 2)];
        java.lang.String utf8 = readUTF8(i3, cArr);
        java.lang.String utf9 = readUTF8(i3 + 2, cArr);
        int i4 = this.bootstrapMethodOffsets[readUnsignedShort(i2)];
        org.objectweb.asm.Handle handle = (org.objectweb.asm.Handle) readConst(readUnsignedShort(i4), cArr);
        int unsignedShort = readUnsignedShort(i4 + 2);
        java.lang.Object[] objArr = new java.lang.Object[unsignedShort];
        int i5 = i4 + 4;
        for (int i6 = 0; i6 < unsignedShort; i6++) {
            objArr[i6] = readConst(readUnsignedShort(i5), cArr);
            i5 += 2;
        }
        org.objectweb.asm.ConstantDynamic[] constantDynamicArr = this.constantDynamicValues;
        org.objectweb.asm.ConstantDynamic constantDynamic2 = new org.objectweb.asm.ConstantDynamic(utf8, utf9, handle, objArr);
        constantDynamicArr[i] = constantDynamic2;
        return constantDynamic2;
    }

    public java.lang.Object readConst(int i, char[] cArr) {
        int i2 = this.cpInfoOffsets[i];
        byte b = this.classFileBuffer[i2 - 1];
        switch (b) {
            case 3:
                return java.lang.Integer.valueOf(readInt(i2));
            case 4:
                return java.lang.Float.valueOf(java.lang.Float.intBitsToFloat(readInt(i2)));
            case 5:
                return java.lang.Long.valueOf(readLong(i2));
            case 6:
                return java.lang.Double.valueOf(java.lang.Double.longBitsToDouble(readLong(i2)));
            case 7:
                return org.objectweb.asm.Type.getObjectType(readUTF8(i2, cArr));
            case 8:
                return readUTF8(i2, cArr);
            default:
                switch (b) {
                    case 15:
                        int i3 = readByte(i2);
                        int i4 = this.cpInfoOffsets[readUnsignedShort(i2 + 1)];
                        int i5 = this.cpInfoOffsets[readUnsignedShort(i4 + 2)];
                        return new org.objectweb.asm.Handle(i3, readClass(i4, cArr), readUTF8(i5, cArr), readUTF8(i5 + 2, cArr), this.classFileBuffer[i4 - 1] == 11);
                    case 16:
                        return org.objectweb.asm.Type.getMethodType(readUTF8(i2, cArr));
                    case 17:
                        return readConstantDynamic(i, cArr);
                    default:
                        throw new java.lang.IllegalArgumentException();
                }
        }
    }
}

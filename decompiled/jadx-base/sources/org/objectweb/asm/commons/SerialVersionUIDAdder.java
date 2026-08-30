package org.objectweb.asm.commons;

/* JADX INFO: loaded from: classes6.dex */
public class SerialVersionUIDAdder extends org.objectweb.asm.ClassVisitor {
    private static final java.lang.String CLINIT = "<clinit>";
    private int access;
    private boolean computeSvuid;
    private boolean hasStaticInitializer;
    private boolean hasSvuid;
    private java.lang.String[] interfaces;
    private java.lang.String name;
    private java.util.Collection<org.objectweb.asm.commons.SerialVersionUIDAdder.Item> svuidConstructors;
    private java.util.Collection<org.objectweb.asm.commons.SerialVersionUIDAdder.Item> svuidFields;
    private java.util.Collection<org.objectweb.asm.commons.SerialVersionUIDAdder.Item> svuidMethods;

    public SerialVersionUIDAdder(org.objectweb.asm.ClassVisitor classVisitor) {
        this(589824, classVisitor);
        if (getClass() != org.objectweb.asm.commons.SerialVersionUIDAdder.class) {
            throw new java.lang.IllegalStateException();
        }
    }

    protected SerialVersionUIDAdder(int i, org.objectweb.asm.ClassVisitor classVisitor) {
        super(i, classVisitor);
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visit(int i, int i2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String[] strArr) {
        boolean z = (i2 & 16384) == 0;
        this.computeSvuid = z;
        if (z) {
            this.name = str;
            this.access = i2;
            this.interfaces = (java.lang.String[]) strArr.clone();
            this.svuidFields = new java.util.ArrayList();
            this.svuidConstructors = new java.util.ArrayList();
            this.svuidMethods = new java.util.ArrayList();
        }
        super.visit(i, i2, str, str2, str3, strArr);
    }

    @Override // org.objectweb.asm.ClassVisitor
    public org.objectweb.asm.MethodVisitor visitMethod(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String[] strArr) {
        if (this.computeSvuid) {
            if (CLINIT.equals(str)) {
                this.hasStaticInitializer = true;
            }
            int i2 = i & 3391;
            if ((i & 2) == 0) {
                if ("<init>".equals(str)) {
                    this.svuidConstructors.add(new org.objectweb.asm.commons.SerialVersionUIDAdder.Item(str, i2, str2));
                } else if (!CLINIT.equals(str)) {
                    this.svuidMethods.add(new org.objectweb.asm.commons.SerialVersionUIDAdder.Item(str, i2, str2));
                }
            }
        }
        return super.visitMethod(i, str, str2, str3, strArr);
    }

    @Override // org.objectweb.asm.ClassVisitor
    public org.objectweb.asm.FieldVisitor visitField(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj) {
        if (this.computeSvuid) {
            if ("serialVersionUID".equals(str)) {
                this.computeSvuid = false;
                this.hasSvuid = true;
            }
            if ((i & 2) == 0 || (i & 136) == 0) {
                this.svuidFields.add(new org.objectweb.asm.commons.SerialVersionUIDAdder.Item(str, i & 223, str2));
            }
        }
        return super.visitField(i, str, str2, str3, obj);
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitInnerClass(java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
        java.lang.String str4 = this.name;
        if (str4 != null && str4.equals(str)) {
            this.access = i;
        }
        super.visitInnerClass(str, str2, str3, i);
    }

    @Override // org.objectweb.asm.ClassVisitor
    public void visitEnd() {
        if (this.computeSvuid && !this.hasSvuid) {
            try {
                addSVUID(computeSVUID());
            } catch (java.io.IOException e) {
                throw new java.lang.IllegalStateException("Error while computing SVUID for " + this.name, e);
            }
        }
        super.visitEnd();
    }

    public boolean hasSVUID() {
        return this.hasSvuid;
    }

    protected void addSVUID(long j) {
        org.objectweb.asm.FieldVisitor fieldVisitorVisitField = super.visitField(24, "serialVersionUID", "J", null, java.lang.Long.valueOf(j));
        if (fieldVisitorVisitField != null) {
            fieldVisitorVisitField.visitEnd();
        }
    }

    protected long computeSVUID() throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeUTF(this.name.replace('/', '.'));
                int i = this.access;
                if ((i & 512) != 0) {
                    i = this.svuidMethods.isEmpty() ? i & (-1025) : i | 1024;
                }
                dataOutputStream.writeInt(i & 1553);
                java.util.Arrays.sort(this.interfaces);
                for (java.lang.String str : this.interfaces) {
                    dataOutputStream.writeUTF(str.replace('/', '.'));
                }
                writeItems(this.svuidFields, dataOutputStream, false);
                if (this.hasStaticInitializer) {
                    dataOutputStream.writeUTF(CLINIT);
                    dataOutputStream.writeInt(8);
                    dataOutputStream.writeUTF("()V");
                }
                writeItems(this.svuidConstructors, dataOutputStream, true);
                writeItems(this.svuidMethods, dataOutputStream, true);
                dataOutputStream.flush();
                byte[] bArrComputeSHAdigest = computeSHAdigest(byteArrayOutputStream.toByteArray());
                long j = 0;
                for (int iMin = java.lang.Math.min(bArrComputeSHAdigest.length, 8) - 1; iMin >= 0; iMin--) {
                    j = (j << 8) | ((long) (bArrComputeSHAdigest[iMin] & 255));
                }
                dataOutputStream.close();
                byteArrayOutputStream.close();
                return j;
            } catch (java.lang.Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (java.lang.Throwable unused) {
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (java.lang.Throwable unused2) {
            }
            throw th2;
        }
    }

    protected byte[] computeSHAdigest(byte[] bArr) {
        try {
            return java.security.MessageDigest.getInstance("SHA").digest(bArr);
        } catch (java.security.NoSuchAlgorithmException e) {
            throw new java.lang.UnsupportedOperationException(e);
        }
    }

    private static void writeItems(java.util.Collection<org.objectweb.asm.commons.SerialVersionUIDAdder.Item> collection, java.io.DataOutput dataOutput, boolean z) throws java.io.IOException {
        org.objectweb.asm.commons.SerialVersionUIDAdder.Item[] itemArr = (org.objectweb.asm.commons.SerialVersionUIDAdder.Item[]) collection.toArray(new org.objectweb.asm.commons.SerialVersionUIDAdder.Item[0]);
        java.util.Arrays.sort(itemArr);
        for (org.objectweb.asm.commons.SerialVersionUIDAdder.Item item : itemArr) {
            dataOutput.writeUTF(item.name);
            dataOutput.writeInt(item.access);
            java.lang.String strReplace = item.descriptor;
            if (z) {
                strReplace = strReplace.replace('/', '.');
            }
            dataOutput.writeUTF(strReplace);
        }
    }

    private static final class Item implements java.lang.Comparable<org.objectweb.asm.commons.SerialVersionUIDAdder.Item> {
        final int access;
        final java.lang.String descriptor;
        final java.lang.String name;

        Item(java.lang.String str, int i, java.lang.String str2) {
            this.name = str;
            this.access = i;
            this.descriptor = str2;
        }

        @Override // java.lang.Comparable
        public int compareTo(org.objectweb.asm.commons.SerialVersionUIDAdder.Item item) {
            int iCompareTo = this.name.compareTo(item.name);
            return iCompareTo == 0 ? this.descriptor.compareTo(item.descriptor) : iCompareTo;
        }

        public boolean equals(java.lang.Object obj) {
            return (obj instanceof org.objectweb.asm.commons.SerialVersionUIDAdder.Item) && compareTo((org.objectweb.asm.commons.SerialVersionUIDAdder.Item) obj) == 0;
        }

        public int hashCode() {
            return this.name.hashCode() ^ this.descriptor.hashCode();
        }
    }
}

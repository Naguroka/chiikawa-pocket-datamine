package org.objectweb.asm;

/* JADX INFO: loaded from: classes6.dex */
abstract class Symbol {
    static final int BOOTSTRAP_METHOD_TAG = 64;
    static final int CONSTANT_CLASS_TAG = 7;
    static final int CONSTANT_DOUBLE_TAG = 6;
    static final int CONSTANT_DYNAMIC_TAG = 17;
    static final int CONSTANT_FIELDREF_TAG = 9;
    static final int CONSTANT_FLOAT_TAG = 4;
    static final int CONSTANT_INTEGER_TAG = 3;
    static final int CONSTANT_INTERFACE_METHODREF_TAG = 11;
    static final int CONSTANT_INVOKE_DYNAMIC_TAG = 18;
    static final int CONSTANT_LONG_TAG = 5;
    static final int CONSTANT_METHODREF_TAG = 10;
    static final int CONSTANT_METHOD_HANDLE_TAG = 15;
    static final int CONSTANT_METHOD_TYPE_TAG = 16;
    static final int CONSTANT_MODULE_TAG = 19;
    static final int CONSTANT_NAME_AND_TYPE_TAG = 12;
    static final int CONSTANT_PACKAGE_TAG = 20;
    static final int CONSTANT_STRING_TAG = 8;
    static final int CONSTANT_UTF8_TAG = 1;
    static final int MERGED_TYPE_TAG = 130;
    static final int TYPE_TAG = 128;
    static final int UNINITIALIZED_TYPE_TAG = 129;
    final long data;
    final int index;
    int info;
    final java.lang.String name;
    final java.lang.String owner;
    final int tag;
    final java.lang.String value;

    Symbol(int i, int i2, java.lang.String str, java.lang.String str2, java.lang.String str3, long j) {
        this.index = i;
        this.tag = i2;
        this.owner = str;
        this.name = str2;
        this.value = str3;
        this.data = j;
    }

    int getArgumentsAndReturnSizes() {
        if (this.info == 0) {
            this.info = org.objectweb.asm.Type.getArgumentsAndReturnSizes(this.value);
        }
        return this.info;
    }
}

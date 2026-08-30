package org.objectweb.asm;

/* JADX INFO: loaded from: classes6.dex */
public final class Handle {
    private final java.lang.String descriptor;
    private final boolean isInterface;
    private final java.lang.String name;
    private final java.lang.String owner;
    private final int tag;

    @java.lang.Deprecated
    public Handle(int i, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this(i, str, str2, str3, i == 9);
    }

    public Handle(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        this.tag = i;
        this.owner = str;
        this.name = str2;
        this.descriptor = str3;
        this.isInterface = z;
    }

    public int getTag() {
        return this.tag;
    }

    public java.lang.String getOwner() {
        return this.owner;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public java.lang.String getDesc() {
        return this.descriptor;
    }

    public boolean isInterface() {
        return this.isInterface;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof org.objectweb.asm.Handle)) {
            return false;
        }
        org.objectweb.asm.Handle handle = (org.objectweb.asm.Handle) obj;
        return this.tag == handle.tag && this.isInterface == handle.isInterface && this.owner.equals(handle.owner) && this.name.equals(handle.name) && this.descriptor.equals(handle.descriptor);
    }

    public int hashCode() {
        return this.tag + (this.isInterface ? 64 : 0) + (this.owner.hashCode() * this.name.hashCode() * this.descriptor.hashCode());
    }

    public java.lang.String toString() {
        return this.owner + '.' + this.name + this.descriptor + " (" + this.tag + (this.isInterface ? " itf" : "") + ')';
    }
}

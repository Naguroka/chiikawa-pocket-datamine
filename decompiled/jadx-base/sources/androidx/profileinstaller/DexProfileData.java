package androidx.profileinstaller;

/* JADX INFO: loaded from: classes3.dex */
class DexProfileData {
    final java.lang.String apkName;
    int classSetSize;
    int[] classes;
    final long dexChecksum;
    final java.lang.String dexName;
    final int hotMethodRegionSize;
    long mTypeIdCount;
    final java.util.TreeMap<java.lang.Integer, java.lang.Integer> methods;
    final int numMethodIds;

    DexProfileData(java.lang.String str, java.lang.String str2, long j, long j2, int i, int i2, int i3, int[] iArr, java.util.TreeMap<java.lang.Integer, java.lang.Integer> treeMap) {
        this.apkName = str;
        this.dexName = str2;
        this.dexChecksum = j;
        this.mTypeIdCount = j2;
        this.classSetSize = i;
        this.hotMethodRegionSize = i2;
        this.numMethodIds = i3;
        this.classes = iArr;
        this.methods = treeMap;
    }
}

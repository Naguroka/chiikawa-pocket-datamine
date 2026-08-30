package androidx.profileinstaller;

/* JADX INFO: loaded from: classes3.dex */
enum FileSectionType {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);

    private final long mValue;

    FileSectionType(long j) {
        this.mValue = j;
    }

    public long getValue() {
        return this.mValue;
    }

    static androidx.profileinstaller.FileSectionType fromValue(long j) {
        androidx.profileinstaller.FileSectionType[] fileSectionTypeArrValues = values();
        for (int i = 0; i < fileSectionTypeArrValues.length; i++) {
            if (fileSectionTypeArrValues[i].getValue() == j) {
                return fileSectionTypeArrValues[i];
            }
        }
        throw new java.lang.IllegalArgumentException("Unsupported FileSection Type " + j);
    }
}

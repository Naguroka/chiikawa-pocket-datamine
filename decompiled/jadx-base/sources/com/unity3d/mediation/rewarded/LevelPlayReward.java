package com.unity3d.mediation.rewarded;

/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/unity3d/mediation/rewarded/LevelPlayReward;", "", "", "component1", "", "component2", "name", "amount", "copy", "toString", "hashCode", "other", "", "equals", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "b", "I", "getAmount", "()I", "<init>", "(Ljava/lang/String;I)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class LevelPlayReward {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int amount;

    public LevelPlayReward(java.lang.String name, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.amount = i;
    }

    public static /* synthetic */ com.unity3d.mediation.rewarded.LevelPlayReward copy$default(com.unity3d.mediation.rewarded.LevelPlayReward levelPlayReward, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = levelPlayReward.name;
        }
        if ((i2 & 2) != 0) {
            i = levelPlayReward.amount;
        }
        return levelPlayReward.copy(str, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAmount() {
        return this.amount;
    }

    public final com.unity3d.mediation.rewarded.LevelPlayReward copy(java.lang.String name, int amount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        return new com.unity3d.mediation.rewarded.LevelPlayReward(name, amount);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.unity3d.mediation.rewarded.LevelPlayReward)) {
            return false;
        }
        com.unity3d.mediation.rewarded.LevelPlayReward levelPlayReward = (com.unity3d.mediation.rewarded.LevelPlayReward) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, levelPlayReward.name) && this.amount == levelPlayReward.amount;
    }

    public final int getAmount() {
        return this.amount;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + java.lang.Integer.hashCode(this.amount);
    }

    public java.lang.String toString() {
        return "LevelPlayReward(name=" + this.name + ", amount=" + this.amount + ')';
    }
}

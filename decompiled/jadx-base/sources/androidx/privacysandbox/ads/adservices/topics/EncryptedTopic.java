package androidx.privacysandbox.ads.adservices.topics;

/* JADX INFO: compiled from: EncryptedTopic.kt */
/* JADX INFO: loaded from: classes3.dex */
@androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures.Ext11OptIn
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0005H\u0016R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0013"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/EncryptedTopic;", "", "encryptedTopic", "", "keyIdentifier", "", "encapsulatedKey", "([BLjava/lang/String;[B)V", "getEncapsulatedKey", "()[B", "getEncryptedTopic", "getKeyIdentifier", "()Ljava/lang/String;", "equals", "", "other", "hashCode", "", "toString", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class EncryptedTopic {
    private final byte[] encapsulatedKey;
    private final byte[] encryptedTopic;
    private final java.lang.String keyIdentifier;

    public EncryptedTopic(byte[] encryptedTopic, java.lang.String keyIdentifier, byte[] encapsulatedKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encryptedTopic, "encryptedTopic");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyIdentifier, "keyIdentifier");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encapsulatedKey, "encapsulatedKey");
        this.encryptedTopic = encryptedTopic;
        this.keyIdentifier = keyIdentifier;
        this.encapsulatedKey = encapsulatedKey;
    }

    public final byte[] getEncryptedTopic() {
        return this.encryptedTopic;
    }

    public final java.lang.String getKeyIdentifier() {
        return this.keyIdentifier;
    }

    public final byte[] getEncapsulatedKey() {
        return this.encapsulatedKey;
    }

    public java.lang.String toString() {
        return "EncryptedTopic { " + ("EncryptedTopic=" + kotlin.text.StringsKt.decodeToString(this.encryptedTopic) + ", KeyIdentifier=" + this.keyIdentifier + ", EncapsulatedKey=" + kotlin.text.StringsKt.decodeToString(this.encapsulatedKey) + " }");
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.privacysandbox.ads.adservices.topics.EncryptedTopic)) {
            return false;
        }
        androidx.privacysandbox.ads.adservices.topics.EncryptedTopic encryptedTopic = (androidx.privacysandbox.ads.adservices.topics.EncryptedTopic) other;
        return java.util.Arrays.equals(this.encryptedTopic, encryptedTopic.encryptedTopic) && this.keyIdentifier.contentEquals(encryptedTopic.keyIdentifier) && java.util.Arrays.equals(this.encapsulatedKey, encryptedTopic.encapsulatedKey);
    }

    public int hashCode() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.encryptedTopic)), this.keyIdentifier, java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.encapsulatedKey)));
    }
}

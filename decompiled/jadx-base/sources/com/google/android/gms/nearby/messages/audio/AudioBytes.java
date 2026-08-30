package com.google.android.gms.nearby.messages.audio;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class AudioBytes {
    public static final int MAX_SIZE = 10;
    private final byte[] zza;

    public AudioBytes(byte[] bArr) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr);
        int length = bArr.length;
        com.google.android.gms.common.internal.Preconditions.checkArgument(length <= 10, "Given byte array longer than 10 bytes, given by AudioBytes.MAX_SIZE.");
        com.google.android.gms.common.internal.Preconditions.checkArgument(length > 0, "Given byte array is of zero length.");
        this.zza = bArr;
    }

    public static com.google.android.gms.nearby.messages.audio.AudioBytes from(com.google.android.gms.nearby.messages.Message message) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(message);
        boolean zZza = message.zza(com.google.android.gms.nearby.messages.Message.MESSAGE_TYPE_AUDIO_BYTES);
        java.lang.String type = message.getType();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(type).length() + 56);
        sb.append("Message type '");
        sb.append(type);
        sb.append("' is not Message.MESSAGE_TYPE_AUDIO_BYTES.");
        com.google.android.gms.common.internal.Preconditions.checkArgument(zZza, sb.toString());
        return new com.google.android.gms.nearby.messages.audio.AudioBytes(message.getContent());
    }

    public byte[] getBytes() {
        return this.zza;
    }

    public com.google.android.gms.nearby.messages.Message toMessage() {
        return new com.google.android.gms.nearby.messages.Message(this.zza, com.google.android.gms.nearby.messages.Message.MESSAGE_NAMESPACE_RESERVED, com.google.android.gms.nearby.messages.Message.MESSAGE_TYPE_AUDIO_BYTES);
    }

    public java.lang.String toString() {
        java.lang.String string = java.util.Arrays.toString(this.zza);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(string).length() + 14);
        sb.append("AudioBytes [");
        sb.append(string);
        sb.append(" ]");
        return sb.toString();
    }
}

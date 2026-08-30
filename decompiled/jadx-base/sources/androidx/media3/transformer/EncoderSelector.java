package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
public interface EncoderSelector {
    public static final androidx.media3.transformer.EncoderSelector DEFAULT = new androidx.media3.transformer.EncoderSelector() { // from class: androidx.media3.transformer.EncoderSelector$$ExternalSyntheticLambda0
        @Override // androidx.media3.transformer.EncoderSelector
        public final com.google.common.collect.ImmutableList selectEncoderInfos(java.lang.String str) {
            return androidx.media3.transformer.EncoderSelector.lambda$static$1(str);
        }
    };

    com.google.common.collect.ImmutableList<android.media.MediaCodecInfo> selectEncoderInfos(java.lang.String str);

    static /* synthetic */ com.google.common.collect.ImmutableList lambda$static$1(final java.lang.String str) {
        com.google.common.collect.ImmutableList<android.media.MediaCodecInfo> supportedEncoders = androidx.media3.transformer.EncoderUtil.getSupportedEncoders(str);
        com.google.common.collect.ImmutableList immutableListCopyOf = com.google.common.collect.ImmutableList.copyOf(com.google.common.collect.Iterables.filter(supportedEncoders, new com.google.common.base.Predicate() { // from class: androidx.media3.transformer.EncoderSelector$$ExternalSyntheticLambda1
            @Override // com.google.common.base.Predicate
            public final boolean apply(java.lang.Object obj) {
                return androidx.media3.transformer.EncoderUtil.isHardwareAccelerated((android.media.MediaCodecInfo) obj, str);
            }
        }));
        return immutableListCopyOf.isEmpty() ? supportedEncoders : immutableListCopyOf;
    }
}

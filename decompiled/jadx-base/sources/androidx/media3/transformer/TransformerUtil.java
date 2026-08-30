package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
public final class TransformerUtil {
    public static int getMediaCodecFlags(int i) {
        int i2 = (i & 1) != 1 ? 0 : 1;
        return (i & 4) == 4 ? i2 | 4 : i2;
    }

    private TransformerUtil() {
    }

    public static int getProcessedTrackType(java.lang.String str) {
        int trackType = androidx.media3.common.MimeTypes.getTrackType(str);
        if (trackType == 4) {
            return 2;
        }
        return trackType;
    }

    public static boolean shouldTranscodeAudio(androidx.media3.common.Format format, androidx.media3.transformer.Composition composition, int i, androidx.media3.transformer.TransformationRequest transformationRequest, androidx.media3.transformer.Codec.EncoderFactory encoderFactory, androidx.media3.transformer.MuxerWrapper muxerWrapper) {
        if (composition.sequences.size() > 1 || composition.sequences.get(i).editedMediaItems.size() > 1) {
            return !composition.transmuxAudio;
        }
        if (encoderFactory.audioNeedsEncoding()) {
            return true;
        }
        if (transformationRequest.audioMimeType != null && !transformationRequest.audioMimeType.equals(format.sampleMimeType)) {
            return true;
        }
        if (transformationRequest.audioMimeType == null && !muxerWrapper.supportsSampleMimeType(format.sampleMimeType)) {
            return true;
        }
        androidx.media3.transformer.EditedMediaItem editedMediaItem = composition.sequences.get(i).editedMediaItems.get(0);
        return ((!editedMediaItem.flattenForSlowMotion || !containsSlowMotionData(format)) && editedMediaItem.effects.audioProcessors.isEmpty() && composition.effects.audioProcessors.isEmpty()) ? false : true;
    }

    private static boolean containsSlowMotionData(androidx.media3.common.Format format) {
        androidx.media3.common.Metadata metadata = format.metadata;
        if (metadata == null) {
            return false;
        }
        for (int i = 0; i < metadata.length(); i++) {
            if (metadata.get(i) instanceof androidx.media3.extractor.metadata.mp4.SlowMotionData) {
                return true;
            }
        }
        return false;
    }

    public static boolean shouldTranscodeVideo(androidx.media3.common.Format format, androidx.media3.transformer.Composition composition, int i, androidx.media3.transformer.TransformationRequest transformationRequest, androidx.media3.transformer.Codec.EncoderFactory encoderFactory, androidx.media3.transformer.MuxerWrapper muxerWrapper) {
        if (composition.sequences.size() > 1 || composition.sequences.get(i).editedMediaItems.size() > 1) {
            return !composition.transmuxVideo;
        }
        androidx.media3.transformer.EditedMediaItem editedMediaItem = composition.sequences.get(i).editedMediaItems.get(0);
        if (encoderFactory.videoNeedsEncoding() || transformationRequest.hdrMode != 0) {
            return true;
        }
        if (transformationRequest.videoMimeType != null && !transformationRequest.videoMimeType.equals(format.sampleMimeType)) {
            return true;
        }
        if ((transformationRequest.videoMimeType == null && !muxerWrapper.supportsSampleMimeType(format.sampleMimeType)) || format.pixelWidthHeightRatio != 1.0f) {
            return true;
        }
        com.google.common.collect.ImmutableList<androidx.media3.common.Effect> immutableList = editedMediaItem.effects.videoEffects;
        return !immutableList.isEmpty() && maybeCalculateTotalRotationDegreesAppliedInEffects(immutableList, format) == -1.0f;
    }

    private static float maybeCalculateTotalRotationDegreesAppliedInEffects(com.google.common.collect.ImmutableList<androidx.media3.common.Effect> immutableList, androidx.media3.common.Format format) {
        int i = format.rotationDegrees % org.objectweb.asm.Opcodes.GETFIELD == 0 ? format.width : format.height;
        int i2 = format.rotationDegrees % org.objectweb.asm.Opcodes.GETFIELD == 0 ? format.height : format.width;
        float f = 0.0f;
        for (int i3 = 0; i3 < immutableList.size(); i3++) {
            androidx.media3.common.Effect effect = immutableList.get(i3);
            if (!(effect instanceof androidx.media3.effect.GlEffect)) {
                return -1.0f;
            }
            androidx.media3.effect.GlEffect glEffect = (androidx.media3.effect.GlEffect) effect;
            if (effect instanceof androidx.media3.effect.ScaleAndRotateTransformation) {
                androidx.media3.effect.ScaleAndRotateTransformation scaleAndRotateTransformation = (androidx.media3.effect.ScaleAndRotateTransformation) effect;
                if (scaleAndRotateTransformation.scaleX != 1.0f || scaleAndRotateTransformation.scaleY != 1.0f) {
                    return -1.0f;
                }
                float f2 = scaleAndRotateTransformation.rotationDegrees;
                if (f2 % 90.0f != 0.0f) {
                    return -1.0f;
                }
                f += f2;
                float f3 = f % 180.0f;
                int i4 = f3 == 0.0f ? format.width : format.height;
                i2 = f3 == 0.0f ? format.height : format.width;
                i = i4;
            } else if (!glEffect.isNoOp(i, i2)) {
                return -1.0f;
            }
        }
        float f4 = f % 360.0f;
        if (f4 % 90.0f == 0.0f) {
            return f4;
        }
        return -1.0f;
    }

    public static void maybeSetMuxerWrapperAdditionalRotationDegrees(androidx.media3.transformer.MuxerWrapper muxerWrapper, com.google.common.collect.ImmutableList<androidx.media3.common.Effect> immutableList, androidx.media3.common.Format format) {
        float fMaybeCalculateTotalRotationDegreesAppliedInEffects = maybeCalculateTotalRotationDegreesAppliedInEffects(immutableList, format);
        if (fMaybeCalculateTotalRotationDegreesAppliedInEffects == 90.0f || fMaybeCalculateTotalRotationDegreesAppliedInEffects == 180.0f || fMaybeCalculateTotalRotationDegreesAppliedInEffects == 270.0f) {
            muxerWrapper.setAdditionalRotationDegrees(360 - java.lang.Math.round(fMaybeCalculateTotalRotationDegreesAppliedInEffects));
        }
    }

    public static androidx.media3.common.ColorInfo getValidColor(androidx.media3.common.ColorInfo colorInfo) {
        return (colorInfo == null || !colorInfo.isDataSpaceValid()) ? androidx.media3.common.ColorInfo.SDR_BT709_LIMITED : colorInfo;
    }

    public static androidx.media3.common.ColorInfo getDecoderOutputColor(androidx.media3.common.ColorInfo colorInfo, boolean z) {
        return (z && androidx.media3.common.ColorInfo.isTransferHdr(colorInfo)) ? androidx.media3.common.ColorInfo.SDR_BT709_LIMITED : colorInfo;
    }

    public static android.util.Pair<java.lang.String, java.lang.Integer> getOutputMimeTypeAndHdrModeAfterFallback(int i, java.lang.String str, androidx.media3.common.ColorInfo colorInfo) {
        if (i == 0 && androidx.media3.common.ColorInfo.isTransferHdr(colorInfo) && androidx.media3.transformer.EncoderUtil.getSupportedEncodersForHdrEditing(str, colorInfo).isEmpty()) {
            if (androidx.media3.transformer.EncoderUtil.getSupportedEncodersForHdrEditing("video/hevc", colorInfo).isEmpty()) {
                i = 2;
            } else {
                str = "video/hevc";
            }
        }
        return android.util.Pair.create(str, java.lang.Integer.valueOf(i));
    }
}

package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
public final class TransformationRequest {
    public final java.lang.String audioMimeType;
    public final int hdrMode;
    public final int outputHeight;
    public final java.lang.String videoMimeType;

    public static final class Builder {
        private java.lang.String audioMimeType;
        private int hdrMode;
        private int outputHeight;
        private java.lang.String videoMimeType;

        public Builder() {
            this.outputHeight = -1;
        }

        private Builder(androidx.media3.transformer.TransformationRequest transformationRequest) {
            this.outputHeight = transformationRequest.outputHeight;
            this.audioMimeType = transformationRequest.audioMimeType;
            this.videoMimeType = transformationRequest.videoMimeType;
            this.hdrMode = transformationRequest.hdrMode;
        }

        public androidx.media3.transformer.TransformationRequest.Builder setVideoMimeType(java.lang.String str) {
            java.lang.String strNormalizeMimeType = androidx.media3.common.MimeTypes.normalizeMimeType(str);
            androidx.media3.common.util.Assertions.checkArgument(strNormalizeMimeType == null || androidx.media3.common.MimeTypes.isVideo(strNormalizeMimeType), "Not a video MIME type: " + strNormalizeMimeType);
            this.videoMimeType = strNormalizeMimeType;
            return this;
        }

        public androidx.media3.transformer.TransformationRequest.Builder setAudioMimeType(java.lang.String str) {
            java.lang.String strNormalizeMimeType = androidx.media3.common.MimeTypes.normalizeMimeType(str);
            androidx.media3.common.util.Assertions.checkArgument(strNormalizeMimeType == null || androidx.media3.common.MimeTypes.isAudio(strNormalizeMimeType), "Not an audio MIME type: " + strNormalizeMimeType);
            this.audioMimeType = strNormalizeMimeType;
            return this;
        }

        public androidx.media3.transformer.TransformationRequest.Builder setHdrMode(int i) {
            this.hdrMode = i;
            return this;
        }

        androidx.media3.transformer.TransformationRequest.Builder setResolution(int i) {
            this.outputHeight = i;
            return this;
        }

        public androidx.media3.transformer.TransformationRequest build() {
            return new androidx.media3.transformer.TransformationRequest(this.outputHeight, this.audioMimeType, this.videoMimeType, this.hdrMode);
        }
    }

    private TransformationRequest(int i, java.lang.String str, java.lang.String str2, int i2) {
        this.outputHeight = i;
        this.audioMimeType = str;
        this.videoMimeType = str2;
        this.hdrMode = i2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.media3.transformer.TransformationRequest)) {
            return false;
        }
        androidx.media3.transformer.TransformationRequest transformationRequest = (androidx.media3.transformer.TransformationRequest) obj;
        return this.outputHeight == transformationRequest.outputHeight && androidx.media3.common.util.Util.areEqual(this.audioMimeType, transformationRequest.audioMimeType) && androidx.media3.common.util.Util.areEqual(this.videoMimeType, transformationRequest.videoMimeType) && this.hdrMode == transformationRequest.hdrMode;
    }

    public int hashCode() {
        int i = this.outputHeight * 31;
        java.lang.String str = this.audioMimeType;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        java.lang.String str2 = this.videoMimeType;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.hdrMode;
    }

    public java.lang.String toString() {
        return "TransformationRequest{outputHeight=" + this.outputHeight + ", audioMimeType='" + this.audioMimeType + "', videoMimeType='" + this.videoMimeType + "', hdrMode=" + this.hdrMode + '}';
    }

    public androidx.media3.transformer.TransformationRequest.Builder buildUpon() {
        return new androidx.media3.transformer.TransformationRequest.Builder();
    }
}

package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
final class OverlayShaderProgram extends androidx.media3.effect.BaseGlShaderProgram {
    private static final java.lang.String FRAGMENT_SHADER_METHODS_INSERT = "shaders/insert_overlay_fragment_shader_methods.glsl";
    private static final int HDR_TYPE_TEXT = 2;
    private static final int HDR_TYPE_ULTRA_HDR = 1;
    private static final int MAX_OVERLAY_SAMPLERS = 15;
    private static final java.lang.String TEXTURE_INDEX_FORMAT_SPECIFIER = "%";
    private static final java.lang.String ULTRA_HDR_INSERT = "shaders/insert_ultra_hdr.glsl";
    private final android.util.SparseIntArray gainmapTexIds;
    private final androidx.media3.common.util.GlProgram glProgram;
    private final int[] hdrTypes;
    private final android.util.SparseArray<android.graphics.Gainmap> lastGainmaps;
    private final com.google.common.collect.ImmutableList<androidx.media3.effect.TextureOverlay> overlays;
    private final androidx.media3.effect.SamplerOverlayMatrixProvider samplerOverlayMatrixProvider;

    public OverlayShaderProgram(android.content.Context context, boolean z, com.google.common.collect.ImmutableList<androidx.media3.effect.TextureOverlay> immutableList) throws androidx.media3.common.VideoFrameProcessingException {
        super(z, 1);
        if (z) {
            this.hdrTypes = findHdrTypes(immutableList);
        } else {
            this.hdrTypes = null;
            androidx.media3.common.util.Assertions.checkArgument(immutableList.size() <= 15, "OverlayShaderProgram does not support more than 15 SDR overlays in the same instance.");
        }
        this.overlays = immutableList;
        this.samplerOverlayMatrixProvider = new androidx.media3.effect.SamplerOverlayMatrixProvider();
        this.lastGainmaps = new android.util.SparseArray<>();
        this.gainmapTexIds = new android.util.SparseIntArray();
        try {
            androidx.media3.common.util.GlProgram glProgram = new androidx.media3.common.util.GlProgram(createVertexShader(immutableList.size()), createFragmentShader(context, immutableList.size(), this.hdrTypes));
            this.glProgram = glProgram;
            glProgram.setBufferAttribute("aFramePosition", androidx.media3.common.util.GlUtil.getNormalizedCoordinateBounds(), 4);
        } catch (androidx.media3.common.util.GlUtil.GlException | java.io.IOException e) {
            throw new androidx.media3.common.VideoFrameProcessingException(e);
        }
    }

    @Override // androidx.media3.effect.BaseGlShaderProgram
    public androidx.media3.common.util.Size configure(int i, int i2) {
        androidx.media3.common.util.Size size = new androidx.media3.common.util.Size(i, i2);
        this.samplerOverlayMatrixProvider.configure(size);
        com.google.common.collect.UnmodifiableIterator<androidx.media3.effect.TextureOverlay> it = this.overlays.iterator();
        while (it.hasNext()) {
            it.next().configure(size);
        }
        return size;
    }

    @Override // androidx.media3.effect.BaseGlShaderProgram
    public void drawFrame(int i, long j) throws androidx.media3.common.VideoFrameProcessingException {
        try {
            this.glProgram.use();
            for (int i2 = 1; i2 <= this.overlays.size(); i2++) {
                int i3 = i2 - 1;
                androidx.media3.effect.TextureOverlay textureOverlay = this.overlays.get(i3);
                int[] iArr = this.hdrTypes;
                if (iArr != null) {
                    int i4 = iArr[i3];
                    if (i4 == 1) {
                        androidx.media3.common.util.Assertions.checkArgument(textureOverlay instanceof androidx.media3.effect.BitmapOverlay);
                        android.graphics.Bitmap bitmap = ((androidx.media3.effect.BitmapOverlay) textureOverlay).getBitmap(j);
                        androidx.media3.common.util.Assertions.checkArgument(bitmap.hasGainmap());
                        android.graphics.Gainmap gainmap = (android.graphics.Gainmap) androidx.media3.common.util.Assertions.checkNotNull(bitmap.getGainmap());
                        android.graphics.Gainmap gainmap2 = this.lastGainmaps.get(i2);
                        if (gainmap2 == null || !androidx.media3.effect.GainmapUtil.equals(gainmap2, gainmap)) {
                            this.lastGainmaps.put(i2, gainmap);
                            if (this.gainmapTexIds.get(i2, -1) == -1) {
                                this.gainmapTexIds.put(i2, androidx.media3.common.util.GlUtil.createTexture(gainmap.getGainmapContents()));
                            } else {
                                androidx.media3.common.util.GlUtil.setTexture(this.gainmapTexIds.get(i2), gainmap.getGainmapContents());
                            }
                            this.glProgram.setSamplerTexIdUniform("uGainmapTexSampler" + i2, this.gainmapTexIds.get(i2), i2);
                            androidx.media3.effect.GainmapUtil.setGainmapUniforms(this.glProgram, this.lastGainmaps.get(i2), i2);
                        }
                    } else if (i4 == 2) {
                        float[] fArrCreate4x4IdentityMatrix = androidx.media3.common.util.GlUtil.create4x4IdentityMatrix();
                        float f = textureOverlay.getOverlaySettings(j).hdrLuminanceMultiplier;
                        android.opengl.Matrix.scaleM(fArrCreate4x4IdentityMatrix, 0, f, f, f);
                        this.glProgram.setFloatsUniform(androidx.media3.common.util.Util.formatInvariant("uLuminanceMatrix%d", java.lang.Integer.valueOf(i2)), fArrCreate4x4IdentityMatrix);
                    }
                }
                this.glProgram.setSamplerTexIdUniform(androidx.media3.common.util.Util.formatInvariant("uOverlayTexSampler%d", java.lang.Integer.valueOf(i2)), textureOverlay.getTextureId(j), i2);
                this.glProgram.setFloatsUniform(androidx.media3.common.util.Util.formatInvariant("uVertexTransformationMatrix%d", java.lang.Integer.valueOf(i2)), textureOverlay.getVertexTransformation(j));
                androidx.media3.effect.OverlaySettings overlaySettings = textureOverlay.getOverlaySettings(j);
                this.glProgram.setFloatsUniform(androidx.media3.common.util.Util.formatInvariant("uTransformationMatrix%d", java.lang.Integer.valueOf(i2)), this.samplerOverlayMatrixProvider.getTransformationMatrix(textureOverlay.getTextureSize(j), overlaySettings));
                this.glProgram.setFloatUniform(androidx.media3.common.util.Util.formatInvariant("uOverlayAlphaScale%d", java.lang.Integer.valueOf(i2)), overlaySettings.alphaScale);
            }
            this.glProgram.setSamplerTexIdUniform("uVideoTexSampler0", i, 0);
            this.glProgram.bindAttributesAndUniforms();
            android.opengl.GLES20.glDrawArrays(5, 0, 4);
            androidx.media3.common.util.GlUtil.checkGlError();
        } catch (androidx.media3.common.util.GlUtil.GlException e) {
            throw new androidx.media3.common.VideoFrameProcessingException(e, j);
        }
    }

    @Override // androidx.media3.effect.BaseGlShaderProgram, androidx.media3.effect.GlShaderProgram
    public void release() throws androidx.media3.common.VideoFrameProcessingException {
        int i;
        super.release();
        try {
            this.glProgram.delete();
            for (int i2 = 0; i2 < this.overlays.size(); i2++) {
                this.overlays.get(i2).release();
                int[] iArr = this.hdrTypes;
                if (iArr != null && iArr[i2] == 1 && (i = this.gainmapTexIds.get(i2, -1)) != -1) {
                    androidx.media3.common.util.GlUtil.deleteTexture(i);
                }
            }
        } catch (androidx.media3.common.util.GlUtil.GlException e) {
            throw new androidx.media3.common.VideoFrameProcessingException(e);
        }
    }

    private static int[] findHdrTypes(com.google.common.collect.ImmutableList<androidx.media3.effect.TextureOverlay> immutableList) {
        int[] iArr = new int[immutableList.size()];
        int i = 15;
        for (int i2 = 0; i2 < immutableList.size(); i2++) {
            androidx.media3.effect.TextureOverlay textureOverlay = immutableList.get(i2);
            if (textureOverlay instanceof androidx.media3.effect.TextOverlay) {
                iArr[i2] = 2;
                i--;
            } else if (textureOverlay instanceof androidx.media3.effect.BitmapOverlay) {
                androidx.media3.common.util.Assertions.checkState(androidx.media3.common.util.Util.SDK_INT >= 34);
                iArr[i2] = 1;
                i -= 2;
            } else {
                throw new java.lang.IllegalArgumentException(textureOverlay + " is not supported on HDR content.");
            }
            if (i < 0) {
                throw new java.lang.IllegalArgumentException("Too many HDR overlays in the same OverlayShaderProgram instance.");
            }
        }
        return iArr;
    }

    private static java.lang.String createVertexShader(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("#version 100\nattribute vec4 aFramePosition;\nvarying vec2 vVideoTexSamplingCoord0;\n");
        for (int i2 = 1; i2 <= i; i2++) {
            sb.append(androidx.media3.common.util.Util.formatInvariant("uniform mat4 uTransformationMatrix%s;\n", java.lang.Integer.valueOf(i2))).append(androidx.media3.common.util.Util.formatInvariant("uniform mat4 uVertexTransformationMatrix%s;\n", java.lang.Integer.valueOf(i2))).append(androidx.media3.common.util.Util.formatInvariant("varying vec2 vOverlayTexSamplingCoord%s;\n", java.lang.Integer.valueOf(i2)));
        }
        sb.append("vec2 getTexSamplingCoord(vec2 ndcPosition){\n  return vec2(ndcPosition.x * 0.5 + 0.5, ndcPosition.y * 0.5 + 0.5);\n}\nvoid main() {\n  gl_Position = aFramePosition;\n  vVideoTexSamplingCoord0 = getTexSamplingCoord(aFramePosition.xy);\n");
        for (int i3 = 1; i3 <= i; i3++) {
            sb.append(replaceFormatSpecifierWithIndex("      vec4 aOverlayPosition% =\n  uVertexTransformationMatrix% * uTransformationMatrix% * aFramePosition;\nvOverlayTexSamplingCoord% = getTexSamplingCoord(aOverlayPosition%.xy);", i3));
        }
        sb.append("}\n");
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x017e  */
    private static java.lang.String createFragmentShader(android.content.Context context, int i, int[] iArr) throws java.io.IOException {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("#version 100\nprecision mediump float;\nuniform sampler2D uVideoTexSampler0;\nvarying vec2 vVideoTexSamplingCoord0;\n\n");
        sb.append(androidx.media3.common.util.Util.loadAsset(context, FRAGMENT_SHADER_METHODS_INSERT));
        if (iArr != null) {
            sb.append(androidx.media3.common.util.Util.loadAsset(context, ULTRA_HDR_INSERT));
        }
        for (int i2 = 1; i2 <= i; i2++) {
            sb.append(androidx.media3.common.util.Util.formatInvariant("uniform sampler2D uOverlayTexSampler%d;\n", java.lang.Integer.valueOf(i2))).append(androidx.media3.common.util.Util.formatInvariant("uniform float uOverlayAlphaScale%d;\n", java.lang.Integer.valueOf(i2))).append(androidx.media3.common.util.Util.formatInvariant("varying vec2 vOverlayTexSamplingCoord%d;\n", java.lang.Integer.valueOf(i2))).append("\n");
            if (iArr != null) {
                int i3 = iArr[i2 - 1];
                if (i3 == 1) {
                    sb.append("// Uniforms for applying the gainmap to the base.\n").append(androidx.media3.common.util.Util.formatInvariant("uniform sampler2D uGainmapTexSampler%d;\n", java.lang.Integer.valueOf(i2))).append(androidx.media3.common.util.Util.formatInvariant("uniform int uGainmapIsAlpha%d;\n", java.lang.Integer.valueOf(i2))).append(androidx.media3.common.util.Util.formatInvariant("uniform int uNoGamma%d;\n", java.lang.Integer.valueOf(i2))).append(androidx.media3.common.util.Util.formatInvariant("uniform int uSingleChannel%d;\n", java.lang.Integer.valueOf(i2))).append(androidx.media3.common.util.Util.formatInvariant("uniform vec4 uLogRatioMin%d;\n", java.lang.Integer.valueOf(i2))).append(androidx.media3.common.util.Util.formatInvariant("uniform vec4 uLogRatioMax%d;\n", java.lang.Integer.valueOf(i2))).append(androidx.media3.common.util.Util.formatInvariant("uniform vec4 uEpsilonSdr%d;\n", java.lang.Integer.valueOf(i2))).append(androidx.media3.common.util.Util.formatInvariant("uniform vec4 uEpsilonHdr%d;\n", java.lang.Integer.valueOf(i2))).append(androidx.media3.common.util.Util.formatInvariant("uniform vec4 uGainmapGamma%d;\n", java.lang.Integer.valueOf(i2))).append(androidx.media3.common.util.Util.formatInvariant("uniform float uDisplayRatioHdr%d;\n", java.lang.Integer.valueOf(i2))).append(androidx.media3.common.util.Util.formatInvariant("uniform float uDisplayRatioSdr%d;\n", java.lang.Integer.valueOf(i2))).append("\n");
                } else if (i3 == 2) {
                    sb.append(androidx.media3.common.util.Util.formatInvariant("uniform mat4 uLuminanceMatrix%d;\n", java.lang.Integer.valueOf(i2)));
                }
            }
        }
        sb.append("void main() {\n vec4 videoColor = vec4(texture2D(uVideoTexSampler0, vVideoTexSamplingCoord0));\n vec4 fragColor = videoColor;\n");
        for (int i4 = 1; i4 <= i; i4++) {
            sb.append(replaceFormatSpecifierWithIndex("        vec4 electricalOverlayColor% = getClampToBorderOverlayColor(\n      uOverlayTexSampler%, vOverlayTexSamplingCoord%, uOverlayAlphaScale%);\n", i4));
            if (iArr == null) {
                str = "electricalOverlayColor";
            } else {
                int i5 = iArr[i4 - 1];
                if (i5 == 1) {
                    sb.append(replaceFormatSpecifierWithIndex("        vec4 gainmap% = texture2D(uGainmapTexSampler%, vOverlayTexSamplingCoord%);\n  vec3 opticalBt709Color% = applyGainmap(\n      srgbEotf(electricalOverlayColor%), gainmap%, uGainmapIsAlpha%, uNoGamma%,\n      uSingleChannel%, uLogRatioMin%, uLogRatioMax%, uEpsilonSdr%, uEpsilonHdr%,\n      uGainmapGamma%, uDisplayRatioHdr%, uDisplayRatioSdr%);\n  vec4 opticalBt2020OverlayColor% =\n      vec4(scaleHdrLuminance(bt709ToBt2020(opticalBt709Color%)),           electricalOverlayColor%.a);", i4));
                    str = "opticalBt2020OverlayColor";
                } else if (i5 == 2) {
                    sb.append(replaceFormatSpecifierWithIndex("vec4 opticalOverlayColor% = uLuminanceMatrix% * srgbEotf(electricalOverlayColor%);\n", i4));
                    str = "opticalOverlayColor";
                } else {
                    str = "electricalOverlayColor";
                }
            }
            sb.append(androidx.media3.common.util.Util.formatInvariant("  fragColor = getMixColor(fragColor, %s%d);\n", str, java.lang.Integer.valueOf(i4)));
        }
        sb.append("  gl_FragColor = fragColor;\n}\n");
        return sb.toString();
    }

    private static java.lang.String replaceFormatSpecifierWithIndex(java.lang.String str, int i) {
        return str.replace(TEXTURE_INDEX_FORMAT_SPECIFIER, java.lang.Integer.toString(i));
    }
}

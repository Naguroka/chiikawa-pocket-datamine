package androidx.media3.extractor.text.ttml;

/* JADX INFO: loaded from: classes.dex */
final class TtmlNode {
    public static final java.lang.String ANNOTATION_POSITION_AFTER = "after";
    public static final java.lang.String ANNOTATION_POSITION_BEFORE = "before";
    public static final java.lang.String ANNOTATION_POSITION_OUTSIDE = "outside";
    public static final java.lang.String ANONYMOUS_REGION_ID = "";
    public static final java.lang.String ATTR_EBUTTS_MULTI_ROW_ALIGN = "multiRowAlign";
    public static final java.lang.String ATTR_ID = "id";
    public static final java.lang.String ATTR_TTS_BACKGROUND_COLOR = "backgroundColor";
    public static final java.lang.String ATTR_TTS_COLOR = "color";
    public static final java.lang.String ATTR_TTS_DISPLAY_ALIGN = "displayAlign";
    public static final java.lang.String ATTR_TTS_EXTENT = "extent";
    public static final java.lang.String ATTR_TTS_FONT_FAMILY = "fontFamily";
    public static final java.lang.String ATTR_TTS_FONT_SIZE = "fontSize";
    public static final java.lang.String ATTR_TTS_FONT_STYLE = "fontStyle";
    public static final java.lang.String ATTR_TTS_FONT_WEIGHT = "fontWeight";
    public static final java.lang.String ATTR_TTS_ORIGIN = "origin";
    public static final java.lang.String ATTR_TTS_RUBY = "ruby";
    public static final java.lang.String ATTR_TTS_RUBY_POSITION = "rubyPosition";
    public static final java.lang.String ATTR_TTS_SHEAR = "shear";
    public static final java.lang.String ATTR_TTS_TEXT_ALIGN = "textAlign";
    public static final java.lang.String ATTR_TTS_TEXT_COMBINE = "textCombine";
    public static final java.lang.String ATTR_TTS_TEXT_DECORATION = "textDecoration";
    public static final java.lang.String ATTR_TTS_TEXT_EMPHASIS = "textEmphasis";
    public static final java.lang.String ATTR_TTS_WRITING_MODE = "writingMode";
    public static final java.lang.String BOLD = "bold";
    public static final java.lang.String CENTER = "center";
    public static final java.lang.String COMBINE_ALL = "all";
    public static final java.lang.String COMBINE_NONE = "none";
    public static final java.lang.String END = "end";
    public static final java.lang.String ITALIC = "italic";
    public static final java.lang.String LEFT = "left";
    public static final java.lang.String LINETHROUGH = "linethrough";
    public static final java.lang.String NO_LINETHROUGH = "nolinethrough";
    public static final java.lang.String NO_UNDERLINE = "nounderline";
    public static final java.lang.String RIGHT = "right";
    public static final java.lang.String RUBY_BASE = "base";
    public static final java.lang.String RUBY_BASE_CONTAINER = "baseContainer";
    public static final java.lang.String RUBY_CONTAINER = "container";
    public static final java.lang.String RUBY_DELIMITER = "delimiter";
    public static final java.lang.String RUBY_TEXT = "text";
    public static final java.lang.String RUBY_TEXT_CONTAINER = "textContainer";
    public static final java.lang.String START = "start";
    public static final java.lang.String TAG_BODY = "body";
    public static final java.lang.String TAG_BR = "br";
    public static final java.lang.String TAG_DATA = "data";
    public static final java.lang.String TAG_DIV = "div";
    public static final java.lang.String TAG_HEAD = "head";
    public static final java.lang.String TAG_IMAGE = "image";
    public static final java.lang.String TAG_INFORMATION = "information";
    public static final java.lang.String TAG_LAYOUT = "layout";
    public static final java.lang.String TAG_METADATA = "metadata";
    public static final java.lang.String TAG_P = "p";
    public static final java.lang.String TAG_REGION = "region";
    public static final java.lang.String TAG_SPAN = "span";
    public static final java.lang.String TAG_STYLE = "style";
    public static final java.lang.String TAG_STYLING = "styling";
    public static final java.lang.String TAG_TT = "tt";
    public static final java.lang.String TEXT_EMPHASIS_AUTO = "auto";
    public static final java.lang.String TEXT_EMPHASIS_MARK_CIRCLE = "circle";
    public static final java.lang.String TEXT_EMPHASIS_MARK_DOT = "dot";
    public static final java.lang.String TEXT_EMPHASIS_MARK_FILLED = "filled";
    public static final java.lang.String TEXT_EMPHASIS_MARK_OPEN = "open";
    public static final java.lang.String TEXT_EMPHASIS_MARK_SESAME = "sesame";
    public static final java.lang.String TEXT_EMPHASIS_NONE = "none";
    public static final java.lang.String UNDERLINE = "underline";
    public static final java.lang.String VERTICAL = "tb";
    public static final java.lang.String VERTICAL_LR = "tblr";
    public static final java.lang.String VERTICAL_RL = "tbrl";
    private java.util.List<androidx.media3.extractor.text.ttml.TtmlNode> children;
    public final long endTimeUs;
    public final java.lang.String imageId;
    public final boolean isTextNode;
    private final java.util.HashMap<java.lang.String, java.lang.Integer> nodeEndsByRegion;
    private final java.util.HashMap<java.lang.String, java.lang.Integer> nodeStartsByRegion;
    public final androidx.media3.extractor.text.ttml.TtmlNode parent;
    public final java.lang.String regionId;
    public final long startTimeUs;
    public final androidx.media3.extractor.text.ttml.TtmlStyle style;
    private final java.lang.String[] styleIds;
    public final java.lang.String tag;
    public final java.lang.String text;

    public static androidx.media3.extractor.text.ttml.TtmlNode buildTextNode(java.lang.String str) {
        return new androidx.media3.extractor.text.ttml.TtmlNode(null, androidx.media3.extractor.text.ttml.TtmlRenderUtil.applyTextElementSpacePolicy(str), androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, null, null, "", null, null);
    }

    public static androidx.media3.extractor.text.ttml.TtmlNode buildNode(java.lang.String str, long j, long j2, androidx.media3.extractor.text.ttml.TtmlStyle ttmlStyle, java.lang.String[] strArr, java.lang.String str2, java.lang.String str3, androidx.media3.extractor.text.ttml.TtmlNode ttmlNode) {
        return new androidx.media3.extractor.text.ttml.TtmlNode(str, null, j, j2, ttmlStyle, strArr, str2, str3, ttmlNode);
    }

    private TtmlNode(java.lang.String str, java.lang.String str2, long j, long j2, androidx.media3.extractor.text.ttml.TtmlStyle ttmlStyle, java.lang.String[] strArr, java.lang.String str3, java.lang.String str4, androidx.media3.extractor.text.ttml.TtmlNode ttmlNode) {
        this.tag = str;
        this.text = str2;
        this.imageId = str4;
        this.style = ttmlStyle;
        this.styleIds = strArr;
        this.isTextNode = str2 != null;
        this.startTimeUs = j;
        this.endTimeUs = j2;
        this.regionId = (java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(str3);
        this.parent = ttmlNode;
        this.nodeStartsByRegion = new java.util.HashMap<>();
        this.nodeEndsByRegion = new java.util.HashMap<>();
    }

    public boolean isActive(long j) {
        long j2 = this.startTimeUs;
        return (j2 == androidx.media3.common.C.TIME_UNSET && this.endTimeUs == androidx.media3.common.C.TIME_UNSET) || (j2 <= j && this.endTimeUs == androidx.media3.common.C.TIME_UNSET) || ((j2 == androidx.media3.common.C.TIME_UNSET && j < this.endTimeUs) || (j2 <= j && j < this.endTimeUs));
    }

    public void addChild(androidx.media3.extractor.text.ttml.TtmlNode ttmlNode) {
        if (this.children == null) {
            this.children = new java.util.ArrayList();
        }
        this.children.add(ttmlNode);
    }

    public androidx.media3.extractor.text.ttml.TtmlNode getChild(int i) {
        java.util.List<androidx.media3.extractor.text.ttml.TtmlNode> list = this.children;
        if (list == null) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        return list.get(i);
    }

    public int getChildCount() {
        java.util.List<androidx.media3.extractor.text.ttml.TtmlNode> list = this.children;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public long[] getEventTimesUs() {
        java.util.TreeSet<java.lang.Long> treeSet = new java.util.TreeSet<>();
        int i = 0;
        getEventTimes(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        java.util.Iterator<java.lang.Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = it.next().longValue();
            i++;
        }
        return jArr;
    }

    private void getEventTimes(java.util.TreeSet<java.lang.Long> treeSet, boolean z) {
        boolean zEquals = TAG_P.equals(this.tag);
        boolean zEquals2 = TAG_DIV.equals(this.tag);
        if (z || zEquals || (zEquals2 && this.imageId != null)) {
            long j = this.startTimeUs;
            if (j != androidx.media3.common.C.TIME_UNSET) {
                treeSet.add(java.lang.Long.valueOf(j));
            }
            long j2 = this.endTimeUs;
            if (j2 != androidx.media3.common.C.TIME_UNSET) {
                treeSet.add(java.lang.Long.valueOf(j2));
            }
        }
        if (this.children == null) {
            return;
        }
        for (int i = 0; i < this.children.size(); i++) {
            this.children.get(i).getEventTimes(treeSet, z || zEquals);
        }
    }

    public java.lang.String[] getStyleIds() {
        return this.styleIds;
    }

    public java.util.List<androidx.media3.common.text.Cue> getCues(long j, java.util.Map<java.lang.String, androidx.media3.extractor.text.ttml.TtmlStyle> map, java.util.Map<java.lang.String, androidx.media3.extractor.text.ttml.TtmlRegion> map2, java.util.Map<java.lang.String, java.lang.String> map3) {
        java.util.List<android.util.Pair<java.lang.String, java.lang.String>> arrayList = new java.util.ArrayList<>();
        traverseForImage(j, this.regionId, arrayList);
        java.util.TreeMap treeMap = new java.util.TreeMap();
        traverseForText(j, false, this.regionId, treeMap);
        traverseForStyle(j, map, map2, this.regionId, treeMap);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (android.util.Pair<java.lang.String, java.lang.String> pair : arrayList) {
            java.lang.String str = map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = android.util.Base64.decode(str, 0);
                android.graphics.Bitmap bitmapDecodeByteArray = android.graphics.BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                androidx.media3.extractor.text.ttml.TtmlRegion ttmlRegion = (androidx.media3.extractor.text.ttml.TtmlRegion) androidx.media3.common.util.Assertions.checkNotNull(map2.get(pair.first));
                arrayList2.add(new androidx.media3.common.text.Cue.Builder().setBitmap(bitmapDecodeByteArray).setPosition(ttmlRegion.position).setPositionAnchor(0).setLine(ttmlRegion.line, 0).setLineAnchor(ttmlRegion.lineAnchor).setSize(ttmlRegion.width).setBitmapHeight(ttmlRegion.height).setVerticalType(ttmlRegion.verticalType).build());
            }
        }
        for (java.util.Map.Entry entry : treeMap.entrySet()) {
            androidx.media3.extractor.text.ttml.TtmlRegion ttmlRegion2 = (androidx.media3.extractor.text.ttml.TtmlRegion) androidx.media3.common.util.Assertions.checkNotNull(map2.get(entry.getKey()));
            androidx.media3.common.text.Cue.Builder builder = (androidx.media3.common.text.Cue.Builder) entry.getValue();
            cleanUpText((android.text.SpannableStringBuilder) androidx.media3.common.util.Assertions.checkNotNull(builder.getText()));
            builder.setLine(ttmlRegion2.line, ttmlRegion2.lineType);
            builder.setLineAnchor(ttmlRegion2.lineAnchor);
            builder.setPosition(ttmlRegion2.position);
            builder.setSize(ttmlRegion2.width);
            builder.setTextSize(ttmlRegion2.textSize, ttmlRegion2.textSizeType);
            builder.setVerticalType(ttmlRegion2.verticalType);
            arrayList2.add(builder.build());
        }
        return arrayList2;
    }

    private void traverseForImage(long j, java.lang.String str, java.util.List<android.util.Pair<java.lang.String, java.lang.String>> list) {
        if (!"".equals(this.regionId)) {
            str = this.regionId;
        }
        if (isActive(j) && TAG_DIV.equals(this.tag) && this.imageId != null) {
            list.add(new android.util.Pair<>(str, this.imageId));
            return;
        }
        for (int i = 0; i < getChildCount(); i++) {
            getChild(i).traverseForImage(j, str, list);
        }
    }

    private void traverseForText(long j, boolean z, java.lang.String str, java.util.Map<java.lang.String, androidx.media3.common.text.Cue.Builder> map) {
        this.nodeStartsByRegion.clear();
        this.nodeEndsByRegion.clear();
        if (TAG_METADATA.equals(this.tag)) {
            return;
        }
        if (!"".equals(this.regionId)) {
            str = this.regionId;
        }
        if (this.isTextNode && z) {
            getRegionOutputText(str, map).append((java.lang.CharSequence) androidx.media3.common.util.Assertions.checkNotNull(this.text));
            return;
        }
        if ("br".equals(this.tag) && z) {
            getRegionOutputText(str, map).append('\n');
            return;
        }
        if (isActive(j)) {
            for (java.util.Map.Entry<java.lang.String, androidx.media3.common.text.Cue.Builder> entry : map.entrySet()) {
                this.nodeStartsByRegion.put(entry.getKey(), java.lang.Integer.valueOf(((java.lang.CharSequence) androidx.media3.common.util.Assertions.checkNotNull(entry.getValue().getText())).length()));
            }
            boolean zEquals = TAG_P.equals(this.tag);
            for (int i = 0; i < getChildCount(); i++) {
                getChild(i).traverseForText(j, z || zEquals, str, map);
            }
            if (zEquals) {
                androidx.media3.extractor.text.ttml.TtmlRenderUtil.endParagraph(getRegionOutputText(str, map));
            }
            for (java.util.Map.Entry<java.lang.String, androidx.media3.common.text.Cue.Builder> entry2 : map.entrySet()) {
                this.nodeEndsByRegion.put(entry2.getKey(), java.lang.Integer.valueOf(((java.lang.CharSequence) androidx.media3.common.util.Assertions.checkNotNull(entry2.getValue().getText())).length()));
            }
        }
    }

    private static android.text.SpannableStringBuilder getRegionOutputText(java.lang.String str, java.util.Map<java.lang.String, androidx.media3.common.text.Cue.Builder> map) {
        if (!map.containsKey(str)) {
            androidx.media3.common.text.Cue.Builder builder = new androidx.media3.common.text.Cue.Builder();
            builder.setText(new android.text.SpannableStringBuilder());
            map.put(str, builder);
        }
        return (android.text.SpannableStringBuilder) androidx.media3.common.util.Assertions.checkNotNull(map.get(str).getText());
    }

    private void traverseForStyle(long j, java.util.Map<java.lang.String, androidx.media3.extractor.text.ttml.TtmlStyle> map, java.util.Map<java.lang.String, androidx.media3.extractor.text.ttml.TtmlRegion> map2, java.lang.String str, java.util.Map<java.lang.String, androidx.media3.common.text.Cue.Builder> map3) {
        int i;
        if (isActive(j)) {
            java.lang.String str2 = "".equals(this.regionId) ? str : this.regionId;
            java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.Integer>> it = this.nodeEndsByRegion.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.util.Map.Entry<java.lang.String, java.lang.Integer> next = it.next();
                java.lang.String key = next.getKey();
                int iIntValue = this.nodeStartsByRegion.containsKey(key) ? this.nodeStartsByRegion.get(key).intValue() : 0;
                int iIntValue2 = next.getValue().intValue();
                if (iIntValue != iIntValue2) {
                    applyStyleToOutput(map, (androidx.media3.common.text.Cue.Builder) androidx.media3.common.util.Assertions.checkNotNull(map3.get(key)), iIntValue, iIntValue2, ((androidx.media3.extractor.text.ttml.TtmlRegion) androidx.media3.common.util.Assertions.checkNotNull(map2.get(str2))).verticalType);
                }
            }
            for (i = 0; i < getChildCount(); i++) {
                getChild(i).traverseForStyle(j, map, map2, str2, map3);
            }
        }
    }

    private void applyStyleToOutput(java.util.Map<java.lang.String, androidx.media3.extractor.text.ttml.TtmlStyle> map, androidx.media3.common.text.Cue.Builder builder, int i, int i2, int i3) {
        androidx.media3.extractor.text.ttml.TtmlStyle ttmlStyleResolveStyle = androidx.media3.extractor.text.ttml.TtmlRenderUtil.resolveStyle(this.style, this.styleIds, map);
        android.text.SpannableStringBuilder spannableStringBuilder = (android.text.SpannableStringBuilder) builder.getText();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new android.text.SpannableStringBuilder();
            builder.setText(spannableStringBuilder);
        }
        android.text.SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (ttmlStyleResolveStyle != null) {
            androidx.media3.extractor.text.ttml.TtmlRenderUtil.applyStylesToSpan(spannableStringBuilder2, i, i2, ttmlStyleResolveStyle, this.parent, map, i3);
            if (TAG_P.equals(this.tag)) {
                if (ttmlStyleResolveStyle.getShearPercentage() != Float.MAX_VALUE) {
                    builder.setShearDegrees((ttmlStyleResolveStyle.getShearPercentage() * (-90.0f)) / 100.0f);
                }
                if (ttmlStyleResolveStyle.getTextAlign() != null) {
                    builder.setTextAlignment(ttmlStyleResolveStyle.getTextAlign());
                }
                if (ttmlStyleResolveStyle.getMultiRowAlign() != null) {
                    builder.setMultiRowAlignment(ttmlStyleResolveStyle.getMultiRowAlign());
                }
            }
        }
    }

    private static void cleanUpText(android.text.SpannableStringBuilder spannableStringBuilder) {
        for (androidx.media3.extractor.text.ttml.DeleteTextSpan deleteTextSpan : (androidx.media3.extractor.text.ttml.DeleteTextSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), androidx.media3.extractor.text.ttml.DeleteTextSpan.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(deleteTextSpan), spannableStringBuilder.getSpanEnd(deleteTextSpan), "");
        }
        for (int i = 0; i < spannableStringBuilder.length(); i++) {
            if (spannableStringBuilder.charAt(i) == ' ') {
                int i2 = i + 1;
                int i3 = i2;
                while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                    i3++;
                }
                int i4 = i3 - i2;
                if (i4 > 0) {
                    spannableStringBuilder.delete(i, i4 + i);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
            if (spannableStringBuilder.charAt(i5) == '\n') {
                int i6 = i5 + 1;
                if (spannableStringBuilder.charAt(i6) == ' ') {
                    spannableStringBuilder.delete(i6, i5 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
            if (spannableStringBuilder.charAt(i7) == ' ') {
                int i8 = i7 + 1;
                if (spannableStringBuilder.charAt(i8) == '\n') {
                    spannableStringBuilder.delete(i7, i8);
                }
            }
        }
        if (spannableStringBuilder.length() <= 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            return;
        }
        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
    }
}

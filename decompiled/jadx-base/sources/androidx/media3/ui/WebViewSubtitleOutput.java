package androidx.media3.ui;

/* JADX INFO: loaded from: classes3.dex */
final class WebViewSubtitleOutput extends android.widget.FrameLayout implements androidx.media3.ui.SubtitleView.Output {
    private static final float CSS_LINE_HEIGHT = 1.2f;
    private static final java.lang.String DEFAULT_BACKGROUND_CSS_CLASS = "default_bg";
    private float bottomPaddingFraction;
    private final androidx.media3.ui.CanvasSubtitleOutput canvasSubtitleOutput;
    private float defaultTextSize;
    private int defaultTextSizeType;
    private androidx.media3.ui.CaptionStyleCompat style;
    private java.util.List<androidx.media3.common.text.Cue> textCues;
    private final android.webkit.WebView webView;

    private static int anchorTypeToTranslatePercent(int i) {
        if (i != 1) {
            return i != 2 ? 0 : -100;
        }
        return -50;
    }

    private static java.lang.String convertVerticalTypeToCss(int i) {
        if (i != 1) {
            return i != 2 ? "horizontal-tb" : "vertical-lr";
        }
        return "vertical-rl";
    }

    public WebViewSubtitleOutput(android.content.Context context) {
        this(context, null);
    }

    public WebViewSubtitleOutput(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.textCues = java.util.Collections.emptyList();
        this.style = androidx.media3.ui.CaptionStyleCompat.DEFAULT;
        this.defaultTextSize = 0.0533f;
        this.defaultTextSizeType = 0;
        this.bottomPaddingFraction = 0.08f;
        androidx.media3.ui.CanvasSubtitleOutput canvasSubtitleOutput = new androidx.media3.ui.CanvasSubtitleOutput(context, attributeSet);
        this.canvasSubtitleOutput = canvasSubtitleOutput;
        android.webkit.WebView webView = new android.webkit.WebView(context, attributeSet) { // from class: androidx.media3.ui.WebViewSubtitleOutput.1
            @Override // android.webkit.WebView, android.view.View
            public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
                super.onTouchEvent(motionEvent);
                return false;
            }

            @Override // android.view.View
            public boolean performClick() {
                super.performClick();
                return false;
            }
        };
        this.webView = webView;
        webView.setBackgroundColor(0);
        addView(canvasSubtitleOutput);
        addView(webView);
    }

    @Override // androidx.media3.ui.SubtitleView.Output
    public void update(java.util.List<androidx.media3.common.text.Cue> list, androidx.media3.ui.CaptionStyleCompat captionStyleCompat, float f, int i, float f2) {
        this.style = captionStyleCompat;
        this.defaultTextSize = f;
        this.defaultTextSizeType = i;
        this.bottomPaddingFraction = f2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            androidx.media3.common.text.Cue cue = list.get(i2);
            if (cue.bitmap != null) {
                arrayList.add(cue);
            } else {
                arrayList2.add(cue);
            }
        }
        if (!this.textCues.isEmpty() || !arrayList2.isEmpty()) {
            this.textCues = arrayList2;
            updateWebView();
        }
        this.canvasSubtitleOutput.update(arrayList, captionStyleCompat, f, i, f2);
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!z || this.textCues.isEmpty()) {
            return;
        }
        updateWebView();
    }

    public void destroy() {
        this.webView.destroy();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0102  */
    /* JADX WARN: Code duplicated, block: B:26:0x0112  */
    /* JADX WARN: Code duplicated, block: B:29:0x012c  */
    /* JADX WARN: Code duplicated, block: B:30:0x012f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0146  */
    /* JADX WARN: Code duplicated, block: B:35:0x0149 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x014b  */
    /* JADX WARN: Code duplicated, block: B:37:0x014e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0151 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0153  */
    /* JADX WARN: Code duplicated, block: B:48:0x0169  */
    /* JADX WARN: Code duplicated, block: B:52:0x0191  */
    /* JADX WARN: Code duplicated, block: B:58:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:62:0x022c  */
    /* JADX WARN: Code duplicated, block: B:63:0x024e  */
    private void updateWebView() {
        java.lang.String invariant;
        int iAnchorTypeToTranslatePercent;
        int i;
        java.lang.String invariant2;
        int i2;
        int i3;
        int i4;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        int i5;
        androidx.media3.ui.SpannedToHtmlConverter.HtmlAndCss htmlAndCssConvert;
        java.util.Iterator it;
        androidx.media3.ui.SpannedToHtmlConverter.HtmlAndCss htmlAndCss;
        java.lang.String str5;
        boolean z;
        androidx.media3.ui.WebViewSubtitleOutput webViewSubtitleOutput = this;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i6 = 0;
        java.lang.String strConvertTextSizeToCss = webViewSubtitleOutput.convertTextSizeToCss(webViewSubtitleOutput.defaultTextSizeType, webViewSubtitleOutput.defaultTextSize);
        int i7 = 1;
        float f = CSS_LINE_HEIGHT;
        sb.append(androidx.media3.common.util.Util.formatInvariant("<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", androidx.media3.ui.HtmlUtils.toCssRgba(webViewSubtitleOutput.style.foregroundColor), strConvertTextSizeToCss, java.lang.Float.valueOf(CSS_LINE_HEIGHT), convertCaptionStyleToCssTextShadow(webViewSubtitleOutput.style)));
        java.util.HashMap map = new java.util.HashMap();
        map.put(androidx.media3.ui.HtmlUtils.cssAllClassDescendantsSelector(DEFAULT_BACKGROUND_CSS_CLASS), androidx.media3.common.util.Util.formatInvariant("background-color:%s;", androidx.media3.ui.HtmlUtils.toCssRgba(webViewSubtitleOutput.style.backgroundColor)));
        int i8 = 0;
        while (i8 < webViewSubtitleOutput.textCues.size()) {
            androidx.media3.common.text.Cue cue = webViewSubtitleOutput.textCues.get(i8);
            float f2 = cue.position != -3.4028235E38f ? cue.position * 100.0f : 50.0f;
            int iAnchorTypeToTranslatePercent2 = anchorTypeToTranslatePercent(cue.positionAnchor);
            if (cue.line != -3.4028235E38f) {
                if (cue.lineType != i7) {
                    java.lang.Object[] objArr = new java.lang.Object[i7];
                    objArr[i6] = java.lang.Float.valueOf(cue.line * 100.0f);
                    invariant = androidx.media3.common.util.Util.formatInvariant("%.2f%%", objArr);
                    if (cue.verticalType == i7) {
                        iAnchorTypeToTranslatePercent = -anchorTypeToTranslatePercent(cue.lineAnchor);
                    } else {
                        iAnchorTypeToTranslatePercent = anchorTypeToTranslatePercent(cue.lineAnchor);
                    }
                } else if (cue.line >= 0.0f) {
                    java.lang.Object[] objArr2 = new java.lang.Object[i7];
                    objArr2[i6] = java.lang.Float.valueOf(cue.line * f);
                    invariant = androidx.media3.common.util.Util.formatInvariant("%.2fem", objArr2);
                    iAnchorTypeToTranslatePercent = i6;
                    i = iAnchorTypeToTranslatePercent;
                } else {
                    java.lang.Object[] objArr3 = new java.lang.Object[i7];
                    objArr3[i6] = java.lang.Float.valueOf(((-cue.line) - 1.0f) * f);
                    invariant = androidx.media3.common.util.Util.formatInvariant("%.2fem", objArr3);
                    iAnchorTypeToTranslatePercent = i6;
                    i = i7;
                }
                if (cue.size != -3.4028235E38f) {
                    java.lang.Object[] objArr4 = new java.lang.Object[i7];
                    objArr4[i6] = java.lang.Float.valueOf(cue.size * 100.0f);
                    invariant2 = androidx.media3.common.util.Util.formatInvariant("%.2f%%", objArr4);
                } else {
                    invariant2 = "fit-content";
                }
                java.lang.String strConvertAlignmentToCss = convertAlignmentToCss(cue.textAlignment);
                java.lang.String strConvertVerticalTypeToCss = convertVerticalTypeToCss(cue.verticalType);
                java.lang.String strConvertTextSizeToCss2 = webViewSubtitleOutput.convertTextSizeToCss(cue.textSizeType, cue.textSize);
                if (cue.windowColorSet) {
                    i2 = cue.windowColor;
                } else {
                    i2 = webViewSubtitleOutput.style.windowColor;
                }
                java.lang.String cssRgba = androidx.media3.ui.HtmlUtils.toCssRgba(i2);
                i3 = iAnchorTypeToTranslatePercent;
                i4 = cue.verticalType;
                str = androidx.media3.extractor.text.ttml.TtmlNode.RIGHT;
                str2 = androidx.media3.extractor.text.ttml.TtmlNode.LEFT;
                str3 = "top";
                if (i4 != 1) {
                    if (i != 0) {
                        str = androidx.media3.extractor.text.ttml.TtmlNode.LEFT;
                    }
                    str2 = "top";
                    str3 = str;
                } else if (i4 != 2) {
                    if (i == 0) {
                        str = androidx.media3.extractor.text.ttml.TtmlNode.LEFT;
                    }
                    str2 = "top";
                    str3 = str;
                } else if (i != 0) {
                    str3 = "bottom";
                }
                if (cue.verticalType != 2 || cue.verticalType == 1) {
                    str4 = "height";
                    i5 = i3;
                    i3 = iAnchorTypeToTranslatePercent2;
                } else {
                    str4 = "width";
                    i5 = iAnchorTypeToTranslatePercent2;
                }
                htmlAndCssConvert = androidx.media3.ui.SpannedToHtmlConverter.convert(cue.text, getContext().getResources().getDisplayMetrics().density);
                it = map.keySet().iterator();
                while (it.hasNext()) {
                    java.util.Iterator it2 = it;
                    java.lang.String str6 = (java.lang.String) it.next();
                    androidx.media3.ui.SpannedToHtmlConverter.HtmlAndCss htmlAndCss2 = htmlAndCssConvert;
                    str5 = (java.lang.String) map.put(str6, (java.lang.String) map.get(str6));
                    if (str5 != null || str5.equals(map.get(str6))) {
                        z = true;
                    } else {
                        z = false;
                    }
                    androidx.media3.common.util.Assertions.checkState(z);
                    it = it2;
                    htmlAndCssConvert = htmlAndCss2;
                }
                htmlAndCss = htmlAndCssConvert;
                sb.append(androidx.media3.common.util.Util.formatInvariant("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", java.lang.Integer.valueOf(i8), str2, java.lang.Float.valueOf(f2), str3, invariant, str4, invariant2, strConvertAlignmentToCss, strConvertVerticalTypeToCss, strConvertTextSizeToCss2, cssRgba, java.lang.Integer.valueOf(i5), java.lang.Integer.valueOf(i3), getBlockShearTransformFunction(cue))).append(androidx.media3.common.util.Util.formatInvariant("<span class='%s'>", DEFAULT_BACKGROUND_CSS_CLASS));
                if (cue.multiRowAlignment != null) {
                    sb.append(androidx.media3.common.util.Util.formatInvariant("<span style='display:inline-block; text-align:%s;'>", convertAlignmentToCss(cue.multiRowAlignment))).append(htmlAndCss.html).append("</span>");
                } else {
                    sb.append(htmlAndCss.html);
                }
                sb.append("</span></div>");
                i8++;
                f = CSS_LINE_HEIGHT;
                i6 = 0;
                webViewSubtitleOutput = this;
                i7 = 1;
            } else {
                java.lang.Object[] objArr5 = new java.lang.Object[i7];
                objArr5[i6] = java.lang.Float.valueOf((1.0f - webViewSubtitleOutput.bottomPaddingFraction) * 100.0f);
                invariant = androidx.media3.common.util.Util.formatInvariant("%.2f%%", objArr5);
                iAnchorTypeToTranslatePercent = -100;
            }
            i = i6;
            if (cue.size != -3.4028235E38f) {
                java.lang.Object[] objArr6 = new java.lang.Object[i7];
                objArr6[i6] = java.lang.Float.valueOf(cue.size * 100.0f);
                invariant2 = androidx.media3.common.util.Util.formatInvariant("%.2f%%", objArr6);
            } else {
                invariant2 = "fit-content";
            }
            java.lang.String strConvertAlignmentToCss2 = convertAlignmentToCss(cue.textAlignment);
            java.lang.String strConvertVerticalTypeToCss2 = convertVerticalTypeToCss(cue.verticalType);
            java.lang.String strConvertTextSizeToCss3 = webViewSubtitleOutput.convertTextSizeToCss(cue.textSizeType, cue.textSize);
            if (cue.windowColorSet) {
                i2 = cue.windowColor;
            } else {
                i2 = webViewSubtitleOutput.style.windowColor;
            }
            java.lang.String cssRgba2 = androidx.media3.ui.HtmlUtils.toCssRgba(i2);
            i3 = iAnchorTypeToTranslatePercent;
            i4 = cue.verticalType;
            str = androidx.media3.extractor.text.ttml.TtmlNode.RIGHT;
            str2 = androidx.media3.extractor.text.ttml.TtmlNode.LEFT;
            str3 = "top";
            if (i4 != 1) {
                if (i != 0) {
                    str = androidx.media3.extractor.text.ttml.TtmlNode.LEFT;
                }
                str2 = "top";
                str3 = str;
            } else if (i4 != 2) {
                if (i == 0) {
                    str = androidx.media3.extractor.text.ttml.TtmlNode.LEFT;
                }
                str2 = "top";
                str3 = str;
            } else if (i != 0) {
                str3 = "bottom";
            }
            if (cue.verticalType != 2) {
                str4 = "height";
                i5 = i3;
                i3 = iAnchorTypeToTranslatePercent2;
            } else {
                str4 = "height";
                i5 = i3;
                i3 = iAnchorTypeToTranslatePercent2;
            }
            htmlAndCssConvert = androidx.media3.ui.SpannedToHtmlConverter.convert(cue.text, getContext().getResources().getDisplayMetrics().density);
            it = map.keySet().iterator();
            while (it.hasNext()) {
                java.util.Iterator it3 = it;
                java.lang.String str7 = (java.lang.String) it.next();
                androidx.media3.ui.SpannedToHtmlConverter.HtmlAndCss htmlAndCss3 = htmlAndCssConvert;
                str5 = (java.lang.String) map.put(str7, (java.lang.String) map.get(str7));
                if (str5 != null) {
                    z = true;
                } else {
                    z = true;
                }
                androidx.media3.common.util.Assertions.checkState(z);
                it = it3;
                htmlAndCssConvert = htmlAndCss3;
            }
            htmlAndCss = htmlAndCssConvert;
            sb.append(androidx.media3.common.util.Util.formatInvariant("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", java.lang.Integer.valueOf(i8), str2, java.lang.Float.valueOf(f2), str3, invariant, str4, invariant2, strConvertAlignmentToCss2, strConvertVerticalTypeToCss2, strConvertTextSizeToCss3, cssRgba2, java.lang.Integer.valueOf(i5), java.lang.Integer.valueOf(i3), getBlockShearTransformFunction(cue))).append(androidx.media3.common.util.Util.formatInvariant("<span class='%s'>", DEFAULT_BACKGROUND_CSS_CLASS));
            if (cue.multiRowAlignment != null) {
                sb.append(androidx.media3.common.util.Util.formatInvariant("<span style='display:inline-block; text-align:%s;'>", convertAlignmentToCss(cue.multiRowAlignment))).append(htmlAndCss.html).append("</span>");
            } else {
                sb.append(htmlAndCss.html);
            }
            sb.append("</span></div>");
            i8++;
            f = CSS_LINE_HEIGHT;
            i6 = 0;
            webViewSubtitleOutput = this;
            i7 = 1;
        }
        sb.append("</div></body></html>");
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("<html><head><style>");
        for (java.lang.String str8 : map.keySet()) {
            sb2.append(str8).append("{").append((java.lang.String) map.get(str8)).append("}");
        }
        sb2.append("</style></head>");
        sb.insert(0, sb2.toString());
        this.webView.loadData(android.util.Base64.encodeToString(sb.toString().getBytes(com.google.common.base.Charsets.UTF_8), 1), "text/html", "base64");
    }

    private static java.lang.String getBlockShearTransformFunction(androidx.media3.common.text.Cue cue) {
        if (cue.shearDegrees != 0.0f) {
            return androidx.media3.common.util.Util.formatInvariant("%s(%.2fdeg)", (cue.verticalType == 2 || cue.verticalType == 1) ? "skewY" : "skewX", java.lang.Float.valueOf(cue.shearDegrees));
        }
        return "";
    }

    private java.lang.String convertTextSizeToCss(int i, float f) {
        float fResolveTextSize = androidx.media3.ui.SubtitleViewUtils.resolveTextSize(i, f, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        return fResolveTextSize == -3.4028235E38f ? "unset" : androidx.media3.common.util.Util.formatInvariant("%.2fpx", java.lang.Float.valueOf(fResolveTextSize / getContext().getResources().getDisplayMetrics().density));
    }

    private static java.lang.String convertCaptionStyleToCssTextShadow(androidx.media3.ui.CaptionStyleCompat captionStyleCompat) {
        int i = captionStyleCompat.edgeType;
        if (i == 1) {
            return androidx.media3.common.util.Util.formatInvariant("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", androidx.media3.ui.HtmlUtils.toCssRgba(captionStyleCompat.edgeColor));
        }
        if (i == 2) {
            return androidx.media3.common.util.Util.formatInvariant("0.1em 0.12em 0.15em %s", androidx.media3.ui.HtmlUtils.toCssRgba(captionStyleCompat.edgeColor));
        }
        if (i != 3) {
            return i != 4 ? "unset" : androidx.media3.common.util.Util.formatInvariant("-0.05em -0.05em 0.15em %s", androidx.media3.ui.HtmlUtils.toCssRgba(captionStyleCompat.edgeColor));
        }
        return androidx.media3.common.util.Util.formatInvariant("0.06em 0.08em 0.15em %s", androidx.media3.ui.HtmlUtils.toCssRgba(captionStyleCompat.edgeColor));
    }

    /* JADX INFO: renamed from: androidx.media3.ui.WebViewSubtitleOutput$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$android$text$Layout$Alignment;

        static {
            int[] iArr = new int[android.text.Layout.Alignment.values().length];
            $SwitchMap$android$text$Layout$Alignment = iArr;
            try {
                iArr[android.text.Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$text$Layout$Alignment[android.text.Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$text$Layout$Alignment[android.text.Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    private static java.lang.String convertAlignmentToCss(android.text.Layout.Alignment alignment) {
        if (alignment == null) {
            return androidx.media3.extractor.text.ttml.TtmlNode.CENTER;
        }
        int i = androidx.media3.ui.WebViewSubtitleOutput.AnonymousClass2.$SwitchMap$android$text$Layout$Alignment[alignment.ordinal()];
        if (i != 1) {
            return i != 2 ? androidx.media3.extractor.text.ttml.TtmlNode.CENTER : androidx.media3.extractor.text.ttml.TtmlNode.END;
        }
        return androidx.media3.extractor.text.ttml.TtmlNode.START;
    }
}

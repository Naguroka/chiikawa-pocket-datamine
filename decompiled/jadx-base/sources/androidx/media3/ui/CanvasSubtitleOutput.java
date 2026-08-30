package androidx.media3.ui;

/* JADX INFO: loaded from: classes3.dex */
final class CanvasSubtitleOutput extends android.view.View implements androidx.media3.ui.SubtitleView.Output {
    private float bottomPaddingFraction;
    private java.util.List<androidx.media3.common.text.Cue> cues;
    private final java.util.List<androidx.media3.ui.SubtitlePainter> painters;
    private androidx.media3.ui.CaptionStyleCompat style;
    private float textSize;
    private int textSizeType;

    public CanvasSubtitleOutput(android.content.Context context) {
        this(context, null);
    }

    public CanvasSubtitleOutput(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.painters = new java.util.ArrayList();
        this.cues = java.util.Collections.emptyList();
        this.textSizeType = 0;
        this.textSize = 0.0533f;
        this.style = androidx.media3.ui.CaptionStyleCompat.DEFAULT;
        this.bottomPaddingFraction = 0.08f;
    }

    @Override // androidx.media3.ui.SubtitleView.Output
    public void update(java.util.List<androidx.media3.common.text.Cue> list, androidx.media3.ui.CaptionStyleCompat captionStyleCompat, float f, int i, float f2) {
        this.cues = list;
        this.style = captionStyleCompat;
        this.textSize = f;
        this.textSizeType = i;
        this.bottomPaddingFraction = f2;
        while (this.painters.size() < list.size()) {
            this.painters.add(new androidx.media3.ui.SubtitlePainter(getContext()));
        }
        invalidate();
    }

    @Override // android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        java.util.List<androidx.media3.common.text.Cue> list = this.cues;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i = paddingBottom - paddingTop;
        float fResolveTextSize = androidx.media3.ui.SubtitleViewUtils.resolveTextSize(this.textSizeType, this.textSize, height, i);
        if (fResolveTextSize <= 0.0f) {
            return;
        }
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            androidx.media3.common.text.Cue cueRepositionVerticalCue = list.get(i2);
            if (cueRepositionVerticalCue.verticalType != Integer.MIN_VALUE) {
                cueRepositionVerticalCue = repositionVerticalCue(cueRepositionVerticalCue);
            }
            androidx.media3.common.text.Cue cue = cueRepositionVerticalCue;
            int i3 = paddingBottom;
            this.painters.get(i2).draw(cue, this.style, fResolveTextSize, androidx.media3.ui.SubtitleViewUtils.resolveTextSize(cue.textSizeType, cue.textSize, height, i), this.bottomPaddingFraction, canvas, paddingLeft, paddingTop, width, i3);
            i2++;
            size = size;
            i = i;
            paddingBottom = i3;
            width = width;
        }
    }

    private static androidx.media3.common.text.Cue repositionVerticalCue(androidx.media3.common.text.Cue cue) {
        androidx.media3.common.text.Cue.Builder textAlignment = cue.buildUpon().setPosition(-3.4028235E38f).setPositionAnchor(Integer.MIN_VALUE).setTextAlignment(null);
        if (cue.lineType == 0) {
            textAlignment.setLine(1.0f - cue.line, 0);
        } else {
            textAlignment.setLine((-cue.line) - 1.0f, 1);
        }
        int i = cue.lineAnchor;
        if (i == 0) {
            textAlignment.setLineAnchor(2);
        } else if (i == 2) {
            textAlignment.setLineAnchor(0);
        }
        return textAlignment.build();
    }
}

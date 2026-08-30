package jp.co.applibot.ldx.overlay_exoplayer;

/* JADX INFO: loaded from: classes6.dex */
public class OverlayVideoPlayerView extends android.widget.FrameLayout {
    private android.widget.ImageButton closeButton;
    private android.view.View overlayView;
    private androidx.media3.ui.PlayerView playerView;

    public OverlayVideoPlayerView(android.content.Context context) {
        super(context);
        init(context);
    }

    public OverlayVideoPlayerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public OverlayVideoPlayerView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    private void init(android.content.Context context) {
        android.view.LayoutInflater.from(context).inflate(jp.co.applibot.ldx.overlay_exoplayer.R.layout.overlay_video_player, (android.view.ViewGroup) this, true);
        androidx.media3.ui.PlayerView playerView = (androidx.media3.ui.PlayerView) findViewById(jp.co.applibot.ldx.overlay_exoplayer.R.id.player_view);
        this.playerView = playerView;
        this.closeButton = (android.widget.ImageButton) playerView.findViewById(jp.co.applibot.ldx.overlay_exoplayer.R.id.close_button);
    }

    public androidx.media3.ui.PlayerView GetPlayerView() {
        return this.playerView;
    }

    public android.widget.ImageButton GetCloseButton() {
        return this.closeButton;
    }

    public void SetOverlay(float f) {
        float fMax = java.lang.Math.max(0.0f, java.lang.Math.min(1.0f, f));
        if (fMax <= 0.0f) {
            android.view.View view = this.overlayView;
            if (view == null || view.getParent() == null) {
                return;
            }
            removeView(this.overlayView);
            this.overlayView = null;
            return;
        }
        if (this.overlayView == null) {
            android.view.View view2 = new android.view.View(getContext());
            this.overlayView = view2;
            view2.setClickable(false);
            this.overlayView.setFocusable(false);
        }
        this.overlayView.setBackgroundColor(android.graphics.Color.argb((int) (fMax * 255.0f), 0, 0, 0));
        if (this.overlayView.getParent() == null) {
            addView(this.overlayView, new android.widget.FrameLayout.LayoutParams(-1, -1));
        }
    }
}

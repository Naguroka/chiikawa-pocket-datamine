package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0979Rc implements android.widget.MediaController.MediaPlayerControl {
    public static java.lang.String[] A01 = {"G2jsbExkD9brib249v9eCTdtCCMiwFzU", "MybJItuTTwvMgUX2RH23VAkcAJ", "ow4pie4IyD8vnQFKIBNl8mdJIY6Q5gW8", "kaFU92mf6AOB2B7qFy6jCknY9pgFVbwN", "XSYkluwu3NIdD0aesrZFwy6vCjOS", "MBQtVF6anIuSN", "XyB5XGE3kPOvBkLqSfjYtL", "1ylIFWR"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.LW A00;

    public C0979Rc(com.facebook.ads.redexgen.core.LW lw) {
        this.A00 = lw;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canPause() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekBackward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekForward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getAudioSessionId() {
        if (this.A00.A06 == null) {
            return 0;
        }
        com.facebook.ads.redexgen.core.LW lw = this.A00;
        if (A01[1].length() != 26) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A01;
        strArr[0] = "Hfs5YLVNykkKsniRiyykCGhMklelUedO";
        strArr[3] = "ZNxy2mQzqI9R708Jl4ViCzH0rbFY1aBC";
        return lw.A06.getAudioSessionId();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getBufferPercentage() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getCurrentPosition() {
        return this.A00.getCurrentPosition();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getDuration() {
        return this.A00.getDuration();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean isPlaying() {
        return this.A00.A06 != null && this.A00.A06.isPlaying();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        if (this.A00.A0E != null) {
            this.A00.A0E.ACe();
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void seekTo(int i) {
        this.A00.seekTo(i);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void start() {
        if (this.A00.A0E != null) {
            this.A00.A0E.ACf();
        }
    }
}

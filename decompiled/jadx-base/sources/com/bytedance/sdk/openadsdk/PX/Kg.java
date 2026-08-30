package com.bytedance.sdk.openadsdk.PX;

/* JADX INFO: loaded from: classes4.dex */
public class Kg {
    private int IL = -1;
    private boolean bX = false;
    private final android.media.AudioManager bg;

    public Kg(android.content.Context context) {
        this.bg = (android.media.AudioManager) context.getApplicationContext().getSystemService("audio");
    }

    public int bg() {
        return this.IL;
    }

    public void bg(int i) {
        this.IL = i;
    }

    public boolean IL() {
        if (!this.bX) {
            return false;
        }
        this.bX = false;
        return true;
    }

    public void bg(boolean z) {
        bg(z, false);
    }

    public void bg(boolean z, boolean z2) {
        if (this.bg == null) {
            return;
        }
        int i = 0;
        if (z) {
            int iIR = com.bytedance.sdk.openadsdk.utils.DeviceUtils.iR();
            if (iIR != 0) {
                this.IL = iIR;
            } else if (!z2) {
                return;
            }
            bg(3, 0, 0);
            this.bX = true;
            return;
        }
        int iWR = this.IL;
        if (iWR == 0) {
            iWR = com.bytedance.sdk.openadsdk.utils.DeviceUtils.WR() / 15;
        } else {
            if (iWR == -1) {
                if (!z2) {
                    return;
                } else {
                    iWR = com.bytedance.sdk.openadsdk.utils.DeviceUtils.WR() / 15;
                }
            }
            this.IL = -1;
            bg(3, iWR, i);
            this.bX = true;
        }
        i = 1;
        this.IL = -1;
        bg(3, iWR, i);
        this.bX = true;
    }

    private void bg(int i, int i2, int i3) {
        try {
            this.bg.setStreamVolume(i, i2, i3);
        } catch (java.lang.Throwable unused) {
        }
    }
}

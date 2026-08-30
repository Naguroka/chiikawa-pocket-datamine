package org.fmod;

/* JADX INFO: loaded from: classes6.dex */
final class a implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final org.fmod.FMODAudioDevice f3961a;
    private final java.nio.ByteBuffer b;
    private final int c;
    private final int d;
    private volatile java.lang.Thread e;
    private volatile boolean f;
    private android.media.AudioRecord g;
    private boolean h;

    a(org.fmod.FMODAudioDevice fMODAudioDevice, int i, int i2) {
        this.f3961a = fMODAudioDevice;
        this.c = i;
        this.d = i2;
        this.b = java.nio.ByteBuffer.allocateDirect(android.media.AudioRecord.getMinBufferSize(i, i2, 2));
    }

    private void b() {
        android.media.AudioRecord audioRecord = this.g;
        if (audioRecord != null) {
            if (audioRecord.getState() == 1) {
                this.g.stop();
            }
            this.g.release();
            this.g = null;
        }
        this.b.position(0);
        this.h = false;
    }

    public final int a() {
        return this.b.capacity();
    }

    public final void c() {
        if (this.e != null) {
            d();
        }
        this.f = true;
        this.e = new java.lang.Thread(this);
        this.e.start();
    }

    public final void d() {
        while (this.e != null) {
            this.f = false;
            try {
                this.e.join();
                this.e = null;
            } catch (java.lang.InterruptedException unused) {
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 3;
        while (this.f) {
            if (!this.h && i > 0) {
                b();
                android.media.AudioRecord audioRecord = new android.media.AudioRecord(1, this.c, this.d, 2, this.b.capacity());
                this.g = audioRecord;
                boolean z = audioRecord.getState() == 1;
                this.h = z;
                if (z) {
                    this.b.position(0);
                    this.g.startRecording();
                    i = 3;
                } else {
                    android.util.Log.e("FMOD", "AudioRecord failed to initialize (status " + this.g.getState() + ")");
                    i--;
                    b();
                }
            }
            if (this.h && this.g.getRecordingState() == 3) {
                android.media.AudioRecord audioRecord2 = this.g;
                java.nio.ByteBuffer byteBuffer = this.b;
                this.f3961a.fmodProcessMicData(this.b, audioRecord2.read(byteBuffer, byteBuffer.capacity()));
                this.b.position(0);
            }
        }
        b();
    }
}

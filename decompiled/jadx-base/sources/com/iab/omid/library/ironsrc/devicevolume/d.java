package com.iab.omid.library.ironsrc.devicevolume;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends android.database.ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f2423a;
    private final android.media.AudioManager b;
    private final com.iab.omid.library.ironsrc.devicevolume.a c;
    private final com.iab.omid.library.ironsrc.devicevolume.c d;
    private float e;

    public d(android.os.Handler handler, android.content.Context context, com.iab.omid.library.ironsrc.devicevolume.a aVar, com.iab.omid.library.ironsrc.devicevolume.c cVar) {
        super(handler);
        this.f2423a = context;
        this.b = (android.media.AudioManager) context.getSystemService("audio");
        this.c = aVar;
        this.d = cVar;
    }

    private float a() {
        return this.c.a(this.b.getStreamVolume(3), this.b.getStreamMaxVolume(3));
    }

    private boolean a(float f) {
        return f != this.e;
    }

    private void b() {
        this.d.a(this.e);
    }

    public void c() {
        this.e = a();
        b();
        this.f2423a.getContentResolver().registerContentObserver(android.provider.Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f2423a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        super.onChange(z);
        float fA = a();
        if (a(fA)) {
            this.e = fA;
            b();
        }
    }
}

package com.five_corp.ad.internal.movie.exoplayer;

/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f1971a;
    public final androidx.media3.exoplayer.source.DefaultMediaSourceFactory b;
    public final android.view.TextureView c;
    public final com.five_corp.ad.internal.view.D d;
    public final androidx.media3.common.MediaItem e;
    public final com.five_corp.ad.internal.ad.q f;
    public com.five_corp.ad.internal.movie.exoplayer.b g = null;

    public o(android.content.Context context, android.view.TextureView textureView, com.five_corp.ad.internal.view.D d, androidx.media3.common.MediaItem mediaItem, com.five_corp.ad.internal.ad.q qVar) {
        this.f1971a = context;
        this.b = new androidx.media3.exoplayer.source.DefaultMediaSourceFactory(context);
        this.c = textureView;
        this.d = d;
        this.e = mediaItem;
        this.f = qVar;
    }

    public final com.five_corp.ad.internal.movie.exoplayer.q a() {
        if (this.g == null) {
            throw new java.lang.IllegalStateException("PlayerResourceBuilderImpl.registerCallback must be called.");
        }
        androidx.media3.exoplayer.ExoPlayer.Builder builder = new androidx.media3.exoplayer.ExoPlayer.Builder(this.f1971a);
        builder.setMediaSourceFactory(this.b);
        androidx.media3.exoplayer.ExoPlayer exoPlayerBuild = builder.build();
        exoPlayerBuild.setMediaItem(this.e);
        exoPlayerBuild.setPlayWhenReady(false);
        exoPlayerBuild.setVideoTextureView(this.c);
        com.five_corp.ad.internal.ad.q qVar = this.f;
        return new com.five_corp.ad.internal.movie.exoplayer.q(exoPlayerBuild, this.d, qVar != null ? qVar.f1831a : null, this.g);
    }

    public final void a(com.five_corp.ad.internal.movie.exoplayer.b bVar) {
        this.g = bVar;
    }
}

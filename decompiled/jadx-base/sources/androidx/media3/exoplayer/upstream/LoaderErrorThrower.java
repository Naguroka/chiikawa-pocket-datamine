package androidx.media3.exoplayer.upstream;

/* JADX INFO: loaded from: classes.dex */
public interface LoaderErrorThrower {

    public static final class Placeholder implements androidx.media3.exoplayer.upstream.LoaderErrorThrower {
        @Override // androidx.media3.exoplayer.upstream.LoaderErrorThrower
        public void maybeThrowError() {
        }

        @Override // androidx.media3.exoplayer.upstream.LoaderErrorThrower
        public void maybeThrowError(int i) {
        }
    }

    void maybeThrowError() throws java.io.IOException;

    void maybeThrowError(int i) throws java.io.IOException;
}

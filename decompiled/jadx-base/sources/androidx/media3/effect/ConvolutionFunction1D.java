package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
public interface ConvolutionFunction1D {

    public interface Provider {
        androidx.media3.common.util.Size configure(androidx.media3.common.util.Size size);

        androidx.media3.effect.ConvolutionFunction1D getConvolution(long j);
    }

    float domainEnd();

    float domainStart();

    float value(float f);

    default float width() {
        return domainEnd() - domainStart();
    }
}

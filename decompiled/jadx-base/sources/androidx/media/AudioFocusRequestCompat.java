package androidx.media;

/* JADX INFO: loaded from: classes.dex */
public class AudioFocusRequestCompat {
    static final androidx.media.AudioAttributesCompat FOCUS_DEFAULT_ATTR = new androidx.media.AudioAttributesCompat.Builder().setUsage(1).build();
    private final androidx.media.AudioAttributesCompat mAudioAttributesCompat;
    private final android.os.Handler mFocusChangeHandler;
    private final int mFocusGain;
    private final java.lang.Object mFrameworkAudioFocusRequest;
    private final android.media.AudioManager.OnAudioFocusChangeListener mOnAudioFocusChangeListener;
    private final boolean mPauseOnDuck;

    AudioFocusRequestCompat(int i, android.media.AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, android.os.Handler handler, androidx.media.AudioAttributesCompat audioAttributesCompat, boolean z) {
        this.mFocusGain = i;
        this.mFocusChangeHandler = handler;
        this.mAudioAttributesCompat = audioAttributesCompat;
        this.mPauseOnDuck = z;
        if (android.os.Build.VERSION.SDK_INT < 26 && handler.getLooper() != android.os.Looper.getMainLooper()) {
            this.mOnAudioFocusChangeListener = new androidx.media.AudioFocusRequestCompat.OnAudioFocusChangeListenerHandlerCompat(onAudioFocusChangeListener, handler);
        } else {
            this.mOnAudioFocusChangeListener = onAudioFocusChangeListener;
        }
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            this.mFrameworkAudioFocusRequest = androidx.media.AudioFocusRequestCompat.Api26Impl.createInstance(i, getAudioAttributes(), z, this.mOnAudioFocusChangeListener, handler);
        } else {
            this.mFrameworkAudioFocusRequest = null;
        }
    }

    public int getFocusGain() {
        return this.mFocusGain;
    }

    public androidx.media.AudioAttributesCompat getAudioAttributesCompat() {
        return this.mAudioAttributesCompat;
    }

    public boolean willPauseWhenDucked() {
        return this.mPauseOnDuck;
    }

    public android.media.AudioManager.OnAudioFocusChangeListener getOnAudioFocusChangeListener() {
        return this.mOnAudioFocusChangeListener;
    }

    public android.os.Handler getFocusChangeHandler() {
        return this.mFocusChangeHandler;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.media.AudioFocusRequestCompat)) {
            return false;
        }
        androidx.media.AudioFocusRequestCompat audioFocusRequestCompat = (androidx.media.AudioFocusRequestCompat) obj;
        return this.mFocusGain == audioFocusRequestCompat.mFocusGain && this.mPauseOnDuck == audioFocusRequestCompat.mPauseOnDuck && androidx.core.util.ObjectsCompat.equals(this.mOnAudioFocusChangeListener, audioFocusRequestCompat.mOnAudioFocusChangeListener) && androidx.core.util.ObjectsCompat.equals(this.mFocusChangeHandler, audioFocusRequestCompat.mFocusChangeHandler) && androidx.core.util.ObjectsCompat.equals(this.mAudioAttributesCompat, audioFocusRequestCompat.mAudioAttributesCompat);
    }

    public int hashCode() {
        return androidx.core.util.ObjectsCompat.hash(java.lang.Integer.valueOf(this.mFocusGain), this.mOnAudioFocusChangeListener, this.mFocusChangeHandler, this.mAudioAttributesCompat, java.lang.Boolean.valueOf(this.mPauseOnDuck));
    }

    android.media.AudioAttributes getAudioAttributes() {
        androidx.media.AudioAttributesCompat audioAttributesCompat = this.mAudioAttributesCompat;
        if (audioAttributesCompat != null) {
            return (android.media.AudioAttributes) audioAttributesCompat.unwrap();
        }
        return null;
    }

    android.media.AudioFocusRequest getAudioFocusRequest() {
        return (android.media.AudioFocusRequest) this.mFrameworkAudioFocusRequest;
    }

    public static final class Builder {
        private androidx.media.AudioAttributesCompat mAudioAttributesCompat;
        private android.os.Handler mFocusChangeHandler;
        private int mFocusGain;
        private android.media.AudioManager.OnAudioFocusChangeListener mOnAudioFocusChangeListener;
        private boolean mPauseOnDuck;

        private static boolean isValidFocusGain(int i) {
            return i == 1 || i == 2 || i == 3 || i == 4;
        }

        public Builder(int i) {
            this.mAudioAttributesCompat = androidx.media.AudioFocusRequestCompat.FOCUS_DEFAULT_ATTR;
            setFocusGain(i);
        }

        public Builder(androidx.media.AudioFocusRequestCompat audioFocusRequestCompat) {
            this.mAudioAttributesCompat = androidx.media.AudioFocusRequestCompat.FOCUS_DEFAULT_ATTR;
            if (audioFocusRequestCompat == null) {
                throw new java.lang.IllegalArgumentException("AudioFocusRequestCompat to copy must not be null");
            }
            this.mFocusGain = audioFocusRequestCompat.getFocusGain();
            this.mOnAudioFocusChangeListener = audioFocusRequestCompat.getOnAudioFocusChangeListener();
            this.mFocusChangeHandler = audioFocusRequestCompat.getFocusChangeHandler();
            this.mAudioAttributesCompat = audioFocusRequestCompat.getAudioAttributesCompat();
            this.mPauseOnDuck = audioFocusRequestCompat.willPauseWhenDucked();
        }

        public androidx.media.AudioFocusRequestCompat.Builder setFocusGain(int i) {
            if (!isValidFocusGain(i)) {
                throw new java.lang.IllegalArgumentException("Illegal audio focus gain type " + i);
            }
            this.mFocusGain = i;
            return this;
        }

        public androidx.media.AudioFocusRequestCompat.Builder setOnAudioFocusChangeListener(android.media.AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
            return setOnAudioFocusChangeListener(onAudioFocusChangeListener, new android.os.Handler(android.os.Looper.getMainLooper()));
        }

        public androidx.media.AudioFocusRequestCompat.Builder setOnAudioFocusChangeListener(android.media.AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, android.os.Handler handler) {
            if (onAudioFocusChangeListener == null) {
                throw new java.lang.IllegalArgumentException("OnAudioFocusChangeListener must not be null");
            }
            if (handler == null) {
                throw new java.lang.IllegalArgumentException("Handler must not be null");
            }
            this.mOnAudioFocusChangeListener = onAudioFocusChangeListener;
            this.mFocusChangeHandler = handler;
            return this;
        }

        public androidx.media.AudioFocusRequestCompat.Builder setAudioAttributes(androidx.media.AudioAttributesCompat audioAttributesCompat) {
            if (audioAttributesCompat == null) {
                throw new java.lang.NullPointerException("Illegal null AudioAttributes");
            }
            this.mAudioAttributesCompat = audioAttributesCompat;
            return this;
        }

        public androidx.media.AudioFocusRequestCompat.Builder setWillPauseWhenDucked(boolean z) {
            this.mPauseOnDuck = z;
            return this;
        }

        public androidx.media.AudioFocusRequestCompat build() {
            if (this.mOnAudioFocusChangeListener == null) {
                throw new java.lang.IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
            }
            return new androidx.media.AudioFocusRequestCompat(this.mFocusGain, this.mOnAudioFocusChangeListener, this.mFocusChangeHandler, this.mAudioAttributesCompat, this.mPauseOnDuck);
        }
    }

    private static class OnAudioFocusChangeListenerHandlerCompat implements android.os.Handler.Callback, android.media.AudioManager.OnAudioFocusChangeListener {
        private static final int FOCUS_CHANGE = 2782386;
        private final android.os.Handler mHandler;
        private final android.media.AudioManager.OnAudioFocusChangeListener mListener;

        OnAudioFocusChangeListenerHandlerCompat(android.media.AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, android.os.Handler handler) {
            this.mListener = onAudioFocusChangeListener;
            this.mHandler = new android.os.Handler(handler.getLooper(), this);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i) {
            android.os.Handler handler = this.mHandler;
            handler.sendMessage(android.os.Message.obtain(handler, FOCUS_CHANGE, i, 0));
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message message) {
            if (message.what != FOCUS_CHANGE) {
                return false;
            }
            this.mListener.onAudioFocusChange(message.arg1);
            return true;
        }
    }

    private static class Api26Impl {
        private Api26Impl() {
        }

        static android.media.AudioFocusRequest createInstance(int i, android.media.AudioAttributes audioAttributes, boolean z, android.media.AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, android.os.Handler handler) {
            return new android.media.AudioFocusRequest.Builder(i).setAudioAttributes(audioAttributes).setWillPauseWhenDucked(z).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        }
    }
}

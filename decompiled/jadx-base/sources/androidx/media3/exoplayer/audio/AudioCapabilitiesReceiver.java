package androidx.media3.exoplayer.audio;

/* JADX INFO: loaded from: classes.dex */
public final class AudioCapabilitiesReceiver {
    private androidx.media3.common.AudioAttributes audioAttributes;
    private androidx.media3.exoplayer.audio.AudioCapabilities audioCapabilities;
    private final androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.AudioDeviceCallbackV23 audioDeviceCallback;
    private final android.content.Context context;
    private final androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.ExternalSurroundSoundSettingObserver externalSurroundSoundSettingObserver;
    private final android.os.Handler handler;
    private final android.content.BroadcastReceiver hdmiAudioPlugBroadcastReceiver;
    private final androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.Listener listener;
    private boolean registered;
    private androidx.media3.exoplayer.audio.AudioDeviceInfoApi23 routedDevice;

    public interface Listener {
        void onAudioCapabilitiesChanged(androidx.media3.exoplayer.audio.AudioCapabilities audioCapabilities);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @java.lang.Deprecated
    public AudioCapabilitiesReceiver(android.content.Context context, androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.Listener listener) {
        this(context, listener, androidx.media3.common.AudioAttributes.DEFAULT, (android.media.AudioDeviceInfo) null);
    }

    public AudioCapabilitiesReceiver(android.content.Context context, androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.Listener listener, androidx.media3.common.AudioAttributes audioAttributes, android.media.AudioDeviceInfo audioDeviceInfo) {
        this(context, listener, audioAttributes, (androidx.media3.common.util.Util.SDK_INT < 23 || audioDeviceInfo == null) ? null : new androidx.media3.exoplayer.audio.AudioDeviceInfoApi23(audioDeviceInfo));
    }

    /* JADX WARN: Multi-variable type inference failed */
    AudioCapabilitiesReceiver(android.content.Context context, androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.Listener listener, androidx.media3.common.AudioAttributes audioAttributes, androidx.media3.exoplayer.audio.AudioDeviceInfoApi23 audioDeviceInfoApi23) {
        android.content.Context applicationContext = context.getApplicationContext();
        this.context = applicationContext;
        this.listener = (androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.Listener) androidx.media3.common.util.Assertions.checkNotNull(listener);
        this.audioAttributes = audioAttributes;
        this.routedDevice = audioDeviceInfoApi23;
        android.os.Handler handlerCreateHandlerForCurrentOrMainLooper = androidx.media3.common.util.Util.createHandlerForCurrentOrMainLooper();
        this.handler = handlerCreateHandlerForCurrentOrMainLooper;
        java.lang.Object[] objArr = 0;
        this.audioDeviceCallback = androidx.media3.common.util.Util.SDK_INT >= 23 ? new androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.AudioDeviceCallbackV23() : null;
        this.hdmiAudioPlugBroadcastReceiver = androidx.media3.common.util.Util.SDK_INT >= 21 ? new androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.HdmiAudioPlugBroadcastReceiver() : null;
        android.net.Uri externalSurroundSoundGlobalSettingUri = androidx.media3.exoplayer.audio.AudioCapabilities.getExternalSurroundSoundGlobalSettingUri();
        this.externalSurroundSoundSettingObserver = externalSurroundSoundGlobalSettingUri != null ? new androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.ExternalSurroundSoundSettingObserver(handlerCreateHandlerForCurrentOrMainLooper, applicationContext.getContentResolver(), externalSurroundSoundGlobalSettingUri) : null;
    }

    public void setAudioAttributes(androidx.media3.common.AudioAttributes audioAttributes) {
        this.audioAttributes = audioAttributes;
        onNewAudioCapabilities(androidx.media3.exoplayer.audio.AudioCapabilities.getCapabilitiesInternal(this.context, audioAttributes, this.routedDevice));
    }

    public void setRoutedDevice(android.media.AudioDeviceInfo audioDeviceInfo) {
        androidx.media3.exoplayer.audio.AudioDeviceInfoApi23 audioDeviceInfoApi23 = this.routedDevice;
        if (androidx.media3.common.util.Util.areEqual(audioDeviceInfo, audioDeviceInfoApi23 == null ? null : audioDeviceInfoApi23.audioDeviceInfo)) {
            return;
        }
        androidx.media3.exoplayer.audio.AudioDeviceInfoApi23 audioDeviceInfoApi24 = audioDeviceInfo != null ? new androidx.media3.exoplayer.audio.AudioDeviceInfoApi23(audioDeviceInfo) : null;
        this.routedDevice = audioDeviceInfoApi24;
        onNewAudioCapabilities(androidx.media3.exoplayer.audio.AudioCapabilities.getCapabilitiesInternal(this.context, this.audioAttributes, audioDeviceInfoApi24));
    }

    public androidx.media3.exoplayer.audio.AudioCapabilities register() {
        androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.AudioDeviceCallbackV23 audioDeviceCallbackV23;
        if (this.registered) {
            return (androidx.media3.exoplayer.audio.AudioCapabilities) androidx.media3.common.util.Assertions.checkNotNull(this.audioCapabilities);
        }
        this.registered = true;
        androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.ExternalSurroundSoundSettingObserver externalSurroundSoundSettingObserver = this.externalSurroundSoundSettingObserver;
        if (externalSurroundSoundSettingObserver != null) {
            externalSurroundSoundSettingObserver.register();
        }
        if (androidx.media3.common.util.Util.SDK_INT >= 23 && (audioDeviceCallbackV23 = this.audioDeviceCallback) != null) {
            androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.Api23.registerAudioDeviceCallback(this.context, audioDeviceCallbackV23, this.handler);
        }
        androidx.media3.exoplayer.audio.AudioCapabilities capabilitiesInternal = androidx.media3.exoplayer.audio.AudioCapabilities.getCapabilitiesInternal(this.context, this.hdmiAudioPlugBroadcastReceiver != null ? this.context.registerReceiver(this.hdmiAudioPlugBroadcastReceiver, new android.content.IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.handler) : null, this.audioAttributes, this.routedDevice);
        this.audioCapabilities = capabilitiesInternal;
        return capabilitiesInternal;
    }

    public void unregister() {
        androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.AudioDeviceCallbackV23 audioDeviceCallbackV23;
        if (this.registered) {
            this.audioCapabilities = null;
            if (androidx.media3.common.util.Util.SDK_INT >= 23 && (audioDeviceCallbackV23 = this.audioDeviceCallback) != null) {
                androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.Api23.unregisterAudioDeviceCallback(this.context, audioDeviceCallbackV23);
            }
            android.content.BroadcastReceiver broadcastReceiver = this.hdmiAudioPlugBroadcastReceiver;
            if (broadcastReceiver != null) {
                this.context.unregisterReceiver(broadcastReceiver);
            }
            androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.ExternalSurroundSoundSettingObserver externalSurroundSoundSettingObserver = this.externalSurroundSoundSettingObserver;
            if (externalSurroundSoundSettingObserver != null) {
                externalSurroundSoundSettingObserver.unregister();
            }
            this.registered = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onNewAudioCapabilities(androidx.media3.exoplayer.audio.AudioCapabilities audioCapabilities) {
        if (!this.registered || audioCapabilities.equals(this.audioCapabilities)) {
            return;
        }
        this.audioCapabilities = audioCapabilities;
        this.listener.onAudioCapabilitiesChanged(audioCapabilities);
    }

    private final class HdmiAudioPlugBroadcastReceiver extends android.content.BroadcastReceiver {
        private HdmiAudioPlugBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver audioCapabilitiesReceiver = androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.this;
            audioCapabilitiesReceiver.onNewAudioCapabilities(androidx.media3.exoplayer.audio.AudioCapabilities.getCapabilitiesInternal(context, intent, audioCapabilitiesReceiver.audioAttributes, androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.this.routedDevice));
        }
    }

    private final class ExternalSurroundSoundSettingObserver extends android.database.ContentObserver {
        private final android.content.ContentResolver resolver;
        private final android.net.Uri settingUri;

        public ExternalSurroundSoundSettingObserver(android.os.Handler handler, android.content.ContentResolver contentResolver, android.net.Uri uri) {
            super(handler);
            this.resolver = contentResolver;
            this.settingUri = uri;
        }

        public void register() {
            this.resolver.registerContentObserver(this.settingUri, false, this);
        }

        public void unregister() {
            this.resolver.unregisterContentObserver(this);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver audioCapabilitiesReceiver = androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.this;
            audioCapabilitiesReceiver.onNewAudioCapabilities(androidx.media3.exoplayer.audio.AudioCapabilities.getCapabilitiesInternal(audioCapabilitiesReceiver.context, androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.this.audioAttributes, androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.this.routedDevice));
        }
    }

    private final class AudioDeviceCallbackV23 extends android.media.AudioDeviceCallback {
        private AudioDeviceCallbackV23() {
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(android.media.AudioDeviceInfo[] audioDeviceInfoArr) {
            androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver audioCapabilitiesReceiver = androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.this;
            audioCapabilitiesReceiver.onNewAudioCapabilities(androidx.media3.exoplayer.audio.AudioCapabilities.getCapabilitiesInternal(audioCapabilitiesReceiver.context, androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.this.audioAttributes, androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.this.routedDevice));
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(android.media.AudioDeviceInfo[] audioDeviceInfoArr) {
            if (androidx.media3.common.util.Util.contains(audioDeviceInfoArr, androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.this.routedDevice)) {
                androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.this.routedDevice = null;
            }
            androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver audioCapabilitiesReceiver = androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.this;
            audioCapabilitiesReceiver.onNewAudioCapabilities(androidx.media3.exoplayer.audio.AudioCapabilities.getCapabilitiesInternal(audioCapabilitiesReceiver.context, androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.this.audioAttributes, androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.this.routedDevice));
        }
    }

    private static final class Api23 {
        public static void registerAudioDeviceCallback(android.content.Context context, android.media.AudioDeviceCallback audioDeviceCallback, android.os.Handler handler) {
            ((android.media.AudioManager) androidx.media3.common.util.Assertions.checkNotNull((android.media.AudioManager) context.getSystemService("audio"))).registerAudioDeviceCallback(audioDeviceCallback, handler);
        }

        public static void unregisterAudioDeviceCallback(android.content.Context context, android.media.AudioDeviceCallback audioDeviceCallback) {
            ((android.media.AudioManager) androidx.media3.common.util.Assertions.checkNotNull((android.media.AudioManager) context.getSystemService("audio"))).unregisterAudioDeviceCallback(audioDeviceCallback);
        }

        private Api23() {
        }
    }
}

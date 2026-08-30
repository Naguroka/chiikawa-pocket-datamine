package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class GoogleApiManager implements android.os.Handler.Callback {
    private static com.google.android.gms.common.api.internal.GoogleApiManager zad;
    private com.google.android.gms.common.internal.TelemetryData zah;
    private com.google.android.gms.common.internal.TelemetryLoggingClient zai;
    private final android.content.Context zaj;
    private final com.google.android.gms.common.GoogleApiAvailability zak;
    private final com.google.android.gms.common.internal.zal zal;
    private final android.os.Handler zas;
    private volatile boolean zat;
    public static final com.google.android.gms.common.api.Status zaa = new com.google.android.gms.common.api.Status(4, "Sign-out occurred while this API call was in progress.");
    private static final com.google.android.gms.common.api.Status zab = new com.google.android.gms.common.api.Status(4, "The user must be signed in to make this API call.");
    private static final java.lang.Object zac = new java.lang.Object();
    private static volatile boolean zae = false;
    private long zaf = 10000;
    private boolean zag = false;
    private final java.util.concurrent.atomic.AtomicInteger zam = new java.util.concurrent.atomic.AtomicInteger(1);
    private final java.util.concurrent.atomic.AtomicInteger zan = new java.util.concurrent.atomic.AtomicInteger(0);
    private final java.util.Map zao = new java.util.concurrent.ConcurrentHashMap(5, 0.75f, 1);
    private com.google.android.gms.common.api.internal.zaad zap = null;
    private final java.util.Set zaq = new androidx.collection.ArraySet();
    private final java.util.Set zar = new androidx.collection.ArraySet();

    private GoogleApiManager(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.GoogleApiAvailability googleApiAvailability) {
        this.zat = true;
        this.zaj = context;
        com.google.android.gms.internal.base.zaq zaqVar = new com.google.android.gms.internal.base.zaq(looper, this);
        this.zas = zaqVar;
        this.zak = googleApiAvailability;
        this.zal = new com.google.android.gms.common.internal.zal(googleApiAvailability);
        if (com.google.android.gms.common.util.DeviceProperties.isAuto(context)) {
            this.zat = false;
        }
        zaqVar.sendMessage(zaqVar.obtainMessage(6));
    }

    public static void reportSignOut() {
        synchronized (zac) {
            com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager = zad;
            if (googleApiManager != null) {
                googleApiManager.zan.incrementAndGet();
                android.os.Handler handler = googleApiManager.zas;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
            }
        }
    }

    public static boolean zaE() {
        return zae;
    }

    public static boolean zaF() {
        synchronized (zac) {
            if (zad != null) {
                return false;
            }
            zae = true;
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.android.gms.common.api.Status zaH(com.google.android.gms.common.api.internal.ApiKey apiKey, com.google.android.gms.common.ConnectionResult connectionResult) {
        return new com.google.android.gms.common.api.Status(connectionResult, "API: " + apiKey.zaa() + " is not available on this device. Connection failed with: " + java.lang.String.valueOf(connectionResult));
    }

    private final com.google.android.gms.common.api.internal.zabo zaI(com.google.android.gms.common.api.GoogleApi googleApi) {
        java.util.Map map = this.zao;
        com.google.android.gms.common.api.internal.ApiKey apiKey = googleApi.getApiKey();
        com.google.android.gms.common.api.internal.zabo zaboVar = (com.google.android.gms.common.api.internal.zabo) map.get(apiKey);
        if (zaboVar == null) {
            zaboVar = new com.google.android.gms.common.api.internal.zabo(this, googleApi);
            this.zao.put(apiKey, zaboVar);
        }
        if (zaboVar.zaA()) {
            this.zar.add(apiKey);
        }
        zaboVar.zao();
        return zaboVar;
    }

    private final com.google.android.gms.common.internal.TelemetryLoggingClient zaJ() {
        if (this.zai == null) {
            this.zai = com.google.android.gms.common.internal.TelemetryLogging.getClient(this.zaj);
        }
        return this.zai;
    }

    private final void zaK() {
        com.google.android.gms.common.internal.TelemetryData telemetryData = this.zah;
        if (telemetryData != null) {
            if (telemetryData.zaa() > 0 || zaD()) {
                zaJ().log(telemetryData);
            }
            this.zah = null;
        }
    }

    private final void zaL(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, int i, com.google.android.gms.common.api.GoogleApi googleApi) {
        com.google.android.gms.common.api.internal.zacb zacbVarZaa;
        if (i == 0 || (zacbVarZaa = com.google.android.gms.common.api.internal.zacb.zaa(this, i, googleApi.getApiKey())) == null) {
            return;
        }
        com.google.android.gms.tasks.Task task = taskCompletionSource.getTask();
        android.os.Handler handler = this.zas;
        java.util.Objects.requireNonNull(handler);
        task.addOnCompleteListener(new com.google.android.gms.common.api.internal.zabi(handler), zacbVarZaa);
    }

    public static com.google.android.gms.common.api.internal.GoogleApiManager zaj() {
        com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager;
        synchronized (zac) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(zad, "Must guarantee manager is non-null before using getInstance");
            googleApiManager = zad;
        }
        return googleApiManager;
    }

    public static com.google.android.gms.common.api.internal.GoogleApiManager zak(android.content.Context context) {
        com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager;
        synchronized (zac) {
            if (zad == null) {
                zad = new com.google.android.gms.common.api.internal.GoogleApiManager(context.getApplicationContext(), com.google.android.gms.common.internal.GmsClientSupervisor.getOrStartHandlerThread().getLooper(), com.google.android.gms.common.GoogleApiAvailability.getInstance());
                if (zae) {
                    android.os.Handler handler = zad.zas;
                    java.util.Objects.requireNonNull(handler);
                    com.google.android.gms.common.internal.GmsClient.zaf(new com.google.android.gms.common.api.internal.zabi(handler));
                }
            }
            googleApiManager = zad;
        }
        return googleApiManager;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:65:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:66:0x021e  */
    /* JADX WARN: Code duplicated, block: B:67:0x022b  */
    /* JADX WARN: Instruction removed from duplicated block: B:65:0x01f0, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:67:0x022b, please report this as an issue */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        com.google.android.gms.common.api.internal.zabo zaboVar = null;
        switch (message.what) {
            case 1:
                this.zaf = true == ((java.lang.Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.zas.removeMessages(12);
                for (com.google.android.gms.common.api.internal.ApiKey apiKey : this.zao.keySet()) {
                    android.os.Handler handler = this.zas;
                    handler.sendMessageDelayed(handler.obtainMessage(12, apiKey), this.zaf);
                }
                return true;
            case 2:
                com.google.android.gms.common.api.internal.zal zalVar = (com.google.android.gms.common.api.internal.zal) message.obj;
                for (com.google.android.gms.common.api.internal.ApiKey apiKey2 : zalVar.zab()) {
                    com.google.android.gms.common.api.internal.zabo zaboVar2 = (com.google.android.gms.common.api.internal.zabo) this.zao.get(apiKey2);
                    if (zaboVar2 == null) {
                        zalVar.zac(apiKey2, new com.google.android.gms.common.ConnectionResult(13), null);
                        return true;
                    }
                    if (zaboVar2.zaz()) {
                        zalVar.zac(apiKey2, com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS, zaboVar2.zaf().getEndpointPackageName());
                    } else {
                        com.google.android.gms.common.ConnectionResult connectionResultZad = zaboVar2.zad();
                        if (connectionResultZad != null) {
                            zalVar.zac(apiKey2, connectionResultZad, null);
                        } else {
                            zaboVar2.zat(zalVar);
                            zaboVar2.zao();
                        }
                    }
                }
                return true;
            case 3:
                for (com.google.android.gms.common.api.internal.zabo zaboVar3 : this.zao.values()) {
                    zaboVar3.zan();
                    zaboVar3.zao();
                }
                return true;
            case 4:
            case 8:
            case 13:
                com.google.android.gms.common.api.internal.zacf zacfVar = (com.google.android.gms.common.api.internal.zacf) message.obj;
                com.google.android.gms.common.api.internal.zabo zaboVarZaI = (com.google.android.gms.common.api.internal.zabo) this.zao.get(zacfVar.zac.getApiKey());
                if (zaboVarZaI == null) {
                    zaboVarZaI = zaI(zacfVar.zac);
                }
                if (!zaboVarZaI.zaA() || this.zan.get() == zacfVar.zab) {
                    zaboVarZaI.zap(zacfVar.zaa);
                } else {
                    zacfVar.zaa.zad(zaa);
                    zaboVarZaI.zav();
                }
                return true;
            case 5:
                int i = message.arg1;
                com.google.android.gms.common.ConnectionResult connectionResult = (com.google.android.gms.common.ConnectionResult) message.obj;
                for (com.google.android.gms.common.api.internal.zabo zaboVar4 : this.zao.values()) {
                    if (zaboVar4.zab() == i) {
                        zaboVar = zaboVar4;
                        if (zaboVar != null) {
                            android.util.Log.wtf("GoogleApiManager", "Could not find API instance " + i + " while trying to fail enqueued calls.", new java.lang.Exception());
                        } else if (connectionResult.getErrorCode() == 13) {
                            zaboVar.zaE(new com.google.android.gms.common.api.Status(17, "Error resolution was canceled by the user, original error message: " + this.zak.getErrorString(connectionResult.getErrorCode()) + ": " + connectionResult.getErrorMessage()));
                        } else {
                            zaboVar.zaE(zaH(zaboVar.zad, connectionResult));
                        }
                        return true;
                    }
                }
                if (zaboVar != null) {
                    android.util.Log.wtf("GoogleApiManager", "Could not find API instance " + i + " while trying to fail enqueued calls.", new java.lang.Exception());
                } else if (connectionResult.getErrorCode() == 13) {
                    zaboVar.zaE(new com.google.android.gms.common.api.Status(17, "Error resolution was canceled by the user, original error message: " + this.zak.getErrorString(connectionResult.getErrorCode()) + ": " + connectionResult.getErrorMessage()));
                } else {
                    zaboVar.zaE(zaH(zaboVar.zad, connectionResult));
                }
                return true;
            case 6:
                if (this.zaj.getApplicationContext() instanceof android.app.Application) {
                    com.google.android.gms.common.api.internal.BackgroundDetector.initialize((android.app.Application) this.zaj.getApplicationContext());
                    com.google.android.gms.common.api.internal.BackgroundDetector.getInstance().addListener(new com.google.android.gms.common.api.internal.zabj(this));
                    if (!com.google.android.gms.common.api.internal.BackgroundDetector.getInstance().readCurrentStateIfPossible(true)) {
                        this.zaf = 300000L;
                    }
                }
                return true;
            case 7:
                zaI((com.google.android.gms.common.api.GoogleApi) message.obj);
                return true;
            case 9:
                if (this.zao.containsKey(message.obj)) {
                    ((com.google.android.gms.common.api.internal.zabo) this.zao.get(message.obj)).zau();
                }
                return true;
            case 10:
                java.util.Iterator it = this.zar.iterator();
                while (it.hasNext()) {
                    com.google.android.gms.common.api.internal.zabo zaboVar5 = (com.google.android.gms.common.api.internal.zabo) this.zao.remove((com.google.android.gms.common.api.internal.ApiKey) it.next());
                    if (zaboVar5 != null) {
                        zaboVar5.zav();
                    }
                }
                this.zar.clear();
                return true;
            case 11:
                if (this.zao.containsKey(message.obj)) {
                    ((com.google.android.gms.common.api.internal.zabo) this.zao.get(message.obj)).zaw();
                }
                return true;
            case 12:
                if (this.zao.containsKey(message.obj)) {
                    ((com.google.android.gms.common.api.internal.zabo) this.zao.get(message.obj)).zaB();
                }
                return true;
            case 14:
                com.google.android.gms.common.api.internal.zaae zaaeVar = (com.google.android.gms.common.api.internal.zaae) message.obj;
                com.google.android.gms.common.api.internal.ApiKey apiKeyZaa = zaaeVar.zaa();
                if (this.zao.containsKey(apiKeyZaa)) {
                    zaaeVar.zab().setResult(java.lang.Boolean.valueOf(((com.google.android.gms.common.api.internal.zabo) this.zao.get(apiKeyZaa)).zaO(false)));
                } else {
                    zaaeVar.zab().setResult(false);
                }
                return true;
            case 15:
                com.google.android.gms.common.api.internal.zabp zabpVar = (com.google.android.gms.common.api.internal.zabp) message.obj;
                if (this.zao.containsKey(zabpVar.zaa)) {
                    com.google.android.gms.common.api.internal.zabo.zal((com.google.android.gms.common.api.internal.zabo) this.zao.get(zabpVar.zaa), zabpVar);
                }
                return true;
            case 16:
                com.google.android.gms.common.api.internal.zabp zabpVar2 = (com.google.android.gms.common.api.internal.zabp) message.obj;
                if (this.zao.containsKey(zabpVar2.zaa)) {
                    com.google.android.gms.common.api.internal.zabo.zam((com.google.android.gms.common.api.internal.zabo) this.zao.get(zabpVar2.zaa), zabpVar2);
                }
                return true;
            case 17:
                zaK();
                return true;
            case 18:
                com.google.android.gms.common.api.internal.zacc zaccVar = (com.google.android.gms.common.api.internal.zacc) message.obj;
                if (zaccVar.zac == 0) {
                    zaJ().log(new com.google.android.gms.common.internal.TelemetryData(zaccVar.zab, java.util.Arrays.asList(zaccVar.zaa)));
                } else {
                    com.google.android.gms.common.internal.TelemetryData telemetryData = this.zah;
                    if (telemetryData != null) {
                        java.util.List listZab = telemetryData.zab();
                        if (telemetryData.zaa() != zaccVar.zab || (listZab != null && listZab.size() >= zaccVar.zad)) {
                            this.zas.removeMessages(17);
                            zaK();
                        } else {
                            this.zah.zac(zaccVar.zaa);
                        }
                    }
                    if (this.zah == null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(zaccVar.zaa);
                        this.zah = new com.google.android.gms.common.internal.TelemetryData(zaccVar.zab, arrayList);
                        android.os.Handler handler2 = this.zas;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), zaccVar.zac);
                    }
                }
                return true;
            case 19:
                this.zag = false;
                return true;
            default:
                android.util.Log.w("GoogleApiManager", "Unknown message id: " + message.what);
                return false;
        }
    }

    public final void zaA(com.google.android.gms.common.api.internal.zaad zaadVar) {
        synchronized (zac) {
            if (this.zap != zaadVar) {
                this.zap = zaadVar;
                this.zaq.clear();
            }
            this.zaq.addAll(zaadVar.zaa());
        }
    }

    final void zaB(com.google.android.gms.common.api.internal.zaad zaadVar) {
        synchronized (zac) {
            if (this.zap == zaadVar) {
                this.zap = null;
                this.zaq.clear();
            }
        }
    }

    final boolean zaD() {
        if (this.zag) {
            return false;
        }
        com.google.android.gms.common.internal.RootTelemetryConfiguration config = com.google.android.gms.common.internal.RootTelemetryConfigManager.getInstance().getConfig();
        if (config != null && !config.getMethodInvocationTelemetryEnabled()) {
            return false;
        }
        int iZaa = this.zal.zaa(this.zaj, 203400000);
        return iZaa == -1 || iZaa == 0;
    }

    final boolean zaG(com.google.android.gms.common.ConnectionResult connectionResult, int i) {
        return this.zak.zah(this.zaj, connectionResult, i);
    }

    public final int zaa() {
        return this.zam.getAndIncrement();
    }

    final com.google.android.gms.common.api.internal.zabo zai(com.google.android.gms.common.api.internal.ApiKey apiKey) {
        return (com.google.android.gms.common.api.internal.zabo) this.zao.get(apiKey);
    }

    public final com.google.android.gms.tasks.Task zam(java.lang.Iterable iterable) {
        com.google.android.gms.common.api.internal.zal zalVar = new com.google.android.gms.common.api.internal.zal(iterable);
        this.zas.sendMessage(this.zas.obtainMessage(2, zalVar));
        return zalVar.zaa();
    }

    public final com.google.android.gms.tasks.Task zan(com.google.android.gms.common.api.GoogleApi googleApi) {
        com.google.android.gms.common.api.internal.zaae zaaeVar = new com.google.android.gms.common.api.internal.zaae(googleApi.getApiKey());
        this.zas.sendMessage(this.zas.obtainMessage(14, zaaeVar));
        return zaaeVar.zab().getTask();
    }

    public final com.google.android.gms.tasks.Task zao(com.google.android.gms.common.api.GoogleApi googleApi, com.google.android.gms.common.api.internal.RegisterListenerMethod registerListenerMethod, com.google.android.gms.common.api.internal.UnregisterListenerMethod unregisterListenerMethod, java.lang.Runnable runnable) {
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        zaL(taskCompletionSource, registerListenerMethod.zaa(), googleApi);
        this.zas.sendMessage(this.zas.obtainMessage(8, new com.google.android.gms.common.api.internal.zacf(new com.google.android.gms.common.api.internal.zaf(new com.google.android.gms.common.api.internal.zacg(registerListenerMethod, unregisterListenerMethod, runnable), taskCompletionSource), this.zan.get(), googleApi)));
        return taskCompletionSource.getTask();
    }

    public final com.google.android.gms.tasks.Task zap(com.google.android.gms.common.api.GoogleApi googleApi, com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey listenerKey, int i) {
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        zaL(taskCompletionSource, i, googleApi);
        this.zas.sendMessage(this.zas.obtainMessage(13, new com.google.android.gms.common.api.internal.zacf(new com.google.android.gms.common.api.internal.zah(listenerKey, taskCompletionSource), this.zan.get(), googleApi)));
        return taskCompletionSource.getTask();
    }

    public final void zau(com.google.android.gms.common.api.GoogleApi googleApi, int i, com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl apiMethodImpl) {
        this.zas.sendMessage(this.zas.obtainMessage(4, new com.google.android.gms.common.api.internal.zacf(new com.google.android.gms.common.api.internal.zae(i, apiMethodImpl), this.zan.get(), googleApi)));
    }

    public final void zav(com.google.android.gms.common.api.GoogleApi googleApi, int i, com.google.android.gms.common.api.internal.TaskApiCall taskApiCall, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, com.google.android.gms.common.api.internal.StatusExceptionMapper statusExceptionMapper) {
        zaL(taskCompletionSource, taskApiCall.zaa(), googleApi);
        this.zas.sendMessage(this.zas.obtainMessage(4, new com.google.android.gms.common.api.internal.zacf(new com.google.android.gms.common.api.internal.zag(i, taskApiCall, taskCompletionSource, statusExceptionMapper), this.zan.get(), googleApi)));
    }

    final void zaw(com.google.android.gms.common.internal.MethodInvocation methodInvocation, int i, long j, int i2) {
        this.zas.sendMessage(this.zas.obtainMessage(18, new com.google.android.gms.common.api.internal.zacc(methodInvocation, i, j, i2)));
    }

    public final void zax(com.google.android.gms.common.ConnectionResult connectionResult, int i) {
        if (zaG(connectionResult, i)) {
            return;
        }
        android.os.Handler handler = this.zas;
        handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
    }

    public final void zay() {
        android.os.Handler handler = this.zas;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void zaz(com.google.android.gms.common.api.GoogleApi googleApi) {
        android.os.Handler handler = this.zas;
        handler.sendMessage(handler.obtainMessage(7, googleApi));
    }
}

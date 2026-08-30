package com.unity3d.services.core.configuration;

/* JADX INFO: loaded from: classes6.dex */
public class ExperimentsReader {
    private com.unity3d.services.core.configuration.IExperiments _localExperiments;
    private com.unity3d.services.core.configuration.IExperiments _remoteExperiments;

    public synchronized void updateLocalExperiments(com.unity3d.services.core.configuration.IExperiments iExperiments) {
        this._localExperiments = iExperiments;
    }

    public synchronized void updateRemoteExperiments(com.unity3d.services.core.configuration.IExperiments iExperiments) {
        this._remoteExperiments = iExperiments;
    }

    public synchronized com.unity3d.services.core.configuration.IExperiments getCurrentlyActiveExperiments() {
        com.unity3d.services.core.configuration.IExperiments iExperiments = this._remoteExperiments;
        if (iExperiments == null && this._localExperiments == null) {
            return new com.unity3d.services.core.configuration.Experiments();
        }
        if (iExperiments == null) {
            return this._localExperiments;
        }
        if (this._localExperiments == null) {
            this._localExperiments = new com.unity3d.services.core.configuration.Experiments();
        }
        try {
            return new com.unity3d.services.core.configuration.Experiments(com.unity3d.services.core.misc.Utilities.mergeJsonObjects(this._localExperiments.getNextSessionExperiments(), this._remoteExperiments.getCurrentSessionExperiments()));
        } catch (org.json.JSONException unused) {
            com.unity3d.services.core.log.DeviceLog.error("Couldn't get active experiments, reverting to default experiments");
            return new com.unity3d.services.core.configuration.Experiments();
        }
    }
}

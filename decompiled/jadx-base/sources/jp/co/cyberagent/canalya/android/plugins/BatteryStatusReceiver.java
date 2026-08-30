package jp.co.cyberagent.canalya.android.plugins;

/* JADX INFO: loaded from: classes6.dex */
public interface BatteryStatusReceiver {
    void onReceiveBatteryTemperature(int i);

    void onReceiveLevel(float f);

    void onReceiveStatus(int i);

    void onReceiveVoltage(int i);
}

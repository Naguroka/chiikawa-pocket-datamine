package jp.co.cyberagent.canalya.android.plugins;

/* JADX INFO: loaded from: classes6.dex */
public class BatteryChangedBroadcastReceiver extends android.content.BroadcastReceiver {
    private static final int VALUE_UNINITIALIZED = -1;
    private static final android.content.IntentFilter intentFilter = new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED");
    private final java.util.HashSet<jp.co.cyberagent.canalya.android.plugins.BatteryStatusReceiver> receivers = new java.util.HashSet<>();
    private int prevTemperature = -1;
    private int prevVoltage = -1;
    private int prevStatus = -1;
    private float prevLevel = Float.NaN;

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        onReceive(intent);
    }

    private void onReceive(android.content.Intent intent) {
        int intExtra = intent.getIntExtra("temperature", 0);
        int intExtra2 = intent.getIntExtra("voltage", -1);
        int intExtra3 = intent.getIntExtra("status", 1);
        float intExtra4 = intent.getIntExtra("level", -1) / intent.getIntExtra("scale", -1);
        if (this.prevTemperature != intExtra) {
            this.prevTemperature = intExtra;
            java.util.Iterator<jp.co.cyberagent.canalya.android.plugins.BatteryStatusReceiver> it = this.receivers.iterator();
            while (it.hasNext()) {
                it.next().onReceiveBatteryTemperature(intExtra);
            }
        }
        if (this.prevVoltage != intExtra2) {
            this.prevVoltage = intExtra2;
            java.util.Iterator<jp.co.cyberagent.canalya.android.plugins.BatteryStatusReceiver> it2 = this.receivers.iterator();
            while (it2.hasNext()) {
                it2.next().onReceiveVoltage(intExtra2);
            }
        }
        if (this.prevStatus != intExtra3) {
            this.prevStatus = intExtra3;
            java.util.Iterator<jp.co.cyberagent.canalya.android.plugins.BatteryStatusReceiver> it3 = this.receivers.iterator();
            while (it3.hasNext()) {
                it3.next().onReceiveStatus(intExtra3);
            }
        }
        if (this.prevLevel != intExtra4) {
            this.prevLevel = intExtra4;
            java.util.Iterator<jp.co.cyberagent.canalya.android.plugins.BatteryStatusReceiver> it4 = this.receivers.iterator();
            while (it4.hasNext()) {
                it4.next().onReceiveLevel(intExtra4);
            }
        }
    }

    public void registerToContext(android.content.Context context) {
        android.content.Intent intentRegisterReceiver = context.registerReceiver(this, intentFilter);
        if (intentRegisterReceiver != null) {
            onReceive(intentRegisterReceiver);
        }
    }

    public void unregisterFromContext(android.content.Context context) {
        context.unregisterReceiver(this);
    }

    public void addReceiver(jp.co.cyberagent.canalya.android.plugins.BatteryStatusReceiver batteryStatusReceiver) {
        this.receivers.add(batteryStatusReceiver);
        int i = this.prevTemperature;
        if (i != -1) {
            batteryStatusReceiver.onReceiveBatteryTemperature(i);
        }
        int i2 = this.prevVoltage;
        if (i2 != -1) {
            batteryStatusReceiver.onReceiveVoltage(i2);
        }
        int i3 = this.prevStatus;
        if (i3 != -1) {
            batteryStatusReceiver.onReceiveStatus(i3);
        }
        if (java.lang.Float.isNaN(this.prevLevel)) {
            return;
        }
        batteryStatusReceiver.onReceiveLevel(this.prevLevel);
    }

    public void removeReceiver(jp.co.cyberagent.canalya.android.plugins.BatteryStatusReceiver batteryStatusReceiver) {
        this.receivers.remove(batteryStatusReceiver);
    }
}

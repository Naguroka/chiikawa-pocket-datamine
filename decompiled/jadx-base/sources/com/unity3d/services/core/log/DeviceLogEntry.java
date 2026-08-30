package com.unity3d.services.core.log;

/* JADX INFO: loaded from: classes6.dex */
class DeviceLogEntry {
    private com.unity3d.services.core.log.DeviceLogLevel _logLevel;
    private java.lang.String _originalMessage;
    private java.lang.StackTraceElement _stackTraceElement;

    public DeviceLogEntry(com.unity3d.services.core.log.DeviceLogLevel deviceLogLevel, java.lang.String str, java.lang.StackTraceElement stackTraceElement) {
        this._logLevel = deviceLogLevel;
        this._originalMessage = str;
        this._stackTraceElement = stackTraceElement;
    }

    public com.unity3d.services.core.log.DeviceLogLevel getLogLevel() {
        return this._logLevel;
    }

    public java.lang.String getParsedMessage() {
        java.lang.String className;
        java.lang.String methodName;
        int lineNumber;
        java.lang.String str = this._originalMessage;
        java.lang.StackTraceElement stackTraceElement = this._stackTraceElement;
        if (stackTraceElement != null) {
            className = stackTraceElement.getClassName();
            methodName = this._stackTraceElement.getMethodName();
            lineNumber = this._stackTraceElement.getLineNumber();
        } else {
            className = "UnknownClass";
            methodName = "unknownMethod";
            lineNumber = -1;
        }
        if (str != null && !str.isEmpty()) {
            str = " :: " + str;
        }
        if (str == null) {
            str = "";
        }
        return className + "." + methodName + "()" + (" (line:" + lineNumber + ")") + str;
    }
}

package androidx.constraintlayout.core;

/* JADX INFO: loaded from: classes.dex */
public class GoalRow extends androidx.constraintlayout.core.ArrayRow {
    public GoalRow(androidx.constraintlayout.core.Cache cache) {
        super(cache);
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public void addError(androidx.constraintlayout.core.SolverVariable solverVariable) {
        super.addError(solverVariable);
        solverVariable.usageInRowCount--;
    }
}

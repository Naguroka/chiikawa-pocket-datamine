package androidx.constraintlayout.core;

/* JADX INFO: loaded from: classes.dex */
public class PriorityGoalRow extends androidx.constraintlayout.core.ArrayRow {
    private static final boolean DEBUG = false;
    static final int NOT_FOUND = -1;
    private static final float epsilon = 1.0E-4f;
    private int TABLE_SIZE;
    androidx.constraintlayout.core.PriorityGoalRow.GoalVariableAccessor accessor;
    private androidx.constraintlayout.core.SolverVariable[] arrayGoals;
    androidx.constraintlayout.core.Cache mCache;
    private int numGoals;
    private androidx.constraintlayout.core.SolverVariable[] sortArray;

    class GoalVariableAccessor {
        androidx.constraintlayout.core.PriorityGoalRow row;
        androidx.constraintlayout.core.SolverVariable variable;

        public GoalVariableAccessor(androidx.constraintlayout.core.PriorityGoalRow priorityGoalRow) {
            this.row = priorityGoalRow;
        }

        public void init(androidx.constraintlayout.core.SolverVariable solverVariable) {
            this.variable = solverVariable;
        }

        public boolean addToGoal(androidx.constraintlayout.core.SolverVariable solverVariable, float f) {
            boolean z = true;
            if (!this.variable.inGoal) {
                for (int i = 0; i < 9; i++) {
                    float f2 = solverVariable.goalStrengthVector[i];
                    if (f2 != 0.0f) {
                        float f3 = f2 * f;
                        if (java.lang.Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        this.variable.goalStrengthVector[i] = f3;
                    } else {
                        this.variable.goalStrengthVector[i] = 0.0f;
                    }
                }
                return true;
            }
            for (int i2 = 0; i2 < 9; i2++) {
                float[] fArr = this.variable.goalStrengthVector;
                fArr[i2] = fArr[i2] + (solverVariable.goalStrengthVector[i2] * f);
                if (java.lang.Math.abs(this.variable.goalStrengthVector[i2]) < 1.0E-4f) {
                    this.variable.goalStrengthVector[i2] = 0.0f;
                } else {
                    z = false;
                }
            }
            if (z) {
                androidx.constraintlayout.core.PriorityGoalRow.this.removeGoal(this.variable);
            }
            return false;
        }

        public void add(androidx.constraintlayout.core.SolverVariable solverVariable) {
            for (int i = 0; i < 9; i++) {
                float[] fArr = this.variable.goalStrengthVector;
                fArr[i] = fArr[i] + solverVariable.goalStrengthVector[i];
                if (java.lang.Math.abs(this.variable.goalStrengthVector[i]) < 1.0E-4f) {
                    this.variable.goalStrengthVector[i] = 0.0f;
                }
            }
        }

        public final boolean isNegative() {
            for (int i = 8; i >= 0; i--) {
                float f = this.variable.goalStrengthVector[i];
                if (f > 0.0f) {
                    return false;
                }
                if (f < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean isSmallerThan(androidx.constraintlayout.core.SolverVariable solverVariable) {
            for (int i = 8; i >= 0; i--) {
                float f = solverVariable.goalStrengthVector[i];
                float f2 = this.variable.goalStrengthVector[i];
                if (f2 != f) {
                    if (f2 < f) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final boolean isNull() {
            for (int i = 0; i < 9; i++) {
                if (this.variable.goalStrengthVector[i] != 0.0f) {
                    return false;
                }
            }
            return true;
        }

        public void reset() {
            java.util.Arrays.fill(this.variable.goalStrengthVector, 0.0f);
        }

        public java.lang.String toString() {
            java.lang.String str = "[ ";
            if (this.variable != null) {
                for (int i = 0; i < 9; i++) {
                    str = str + this.variable.goalStrengthVector[i] + " ";
                }
            }
            return str + "] " + this.variable;
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public void clear() {
        this.numGoals = 0;
        this.constantValue = 0.0f;
    }

    public PriorityGoalRow(androidx.constraintlayout.core.Cache cache) {
        super(cache);
        this.TABLE_SIZE = 128;
        this.arrayGoals = new androidx.constraintlayout.core.SolverVariable[128];
        this.sortArray = new androidx.constraintlayout.core.SolverVariable[128];
        this.numGoals = 0;
        this.accessor = new androidx.constraintlayout.core.PriorityGoalRow.GoalVariableAccessor(this);
        this.mCache = cache;
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public boolean isEmpty() {
        return this.numGoals == 0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002e  */
    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public androidx.constraintlayout.core.SolverVariable getPivotCandidate(androidx.constraintlayout.core.LinearSystem linearSystem, boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.numGoals; i2++) {
            androidx.constraintlayout.core.SolverVariable solverVariable = this.arrayGoals[i2];
            if (!zArr[solverVariable.id]) {
                this.accessor.init(solverVariable);
                if (i == -1) {
                    if (this.accessor.isNegative()) {
                        i = i2;
                    }
                } else if (this.accessor.isSmallerThan(this.arrayGoals[i])) {
                    i = i2;
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.arrayGoals[i];
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public void addError(androidx.constraintlayout.core.SolverVariable solverVariable) {
        this.accessor.init(solverVariable);
        this.accessor.reset();
        solverVariable.goalStrengthVector[solverVariable.strength] = 1.0f;
        addToGoal(solverVariable);
    }

    private final void addToGoal(androidx.constraintlayout.core.SolverVariable solverVariable) {
        int i;
        int i2 = this.numGoals + 1;
        androidx.constraintlayout.core.SolverVariable[] solverVariableArr = this.arrayGoals;
        if (i2 > solverVariableArr.length) {
            androidx.constraintlayout.core.SolverVariable[] solverVariableArr2 = (androidx.constraintlayout.core.SolverVariable[]) java.util.Arrays.copyOf(solverVariableArr, solverVariableArr.length * 2);
            this.arrayGoals = solverVariableArr2;
            this.sortArray = (androidx.constraintlayout.core.SolverVariable[]) java.util.Arrays.copyOf(solverVariableArr2, solverVariableArr2.length * 2);
        }
        androidx.constraintlayout.core.SolverVariable[] solverVariableArr3 = this.arrayGoals;
        int i3 = this.numGoals;
        solverVariableArr3[i3] = solverVariable;
        int i4 = i3 + 1;
        this.numGoals = i4;
        if (i4 > 1 && solverVariableArr3[i4 - 1].id > solverVariable.id) {
            int i5 = 0;
            while (true) {
                i = this.numGoals;
                if (i5 >= i) {
                    break;
                }
                this.sortArray[i5] = this.arrayGoals[i5];
                i5++;
            }
            java.util.Arrays.sort(this.sortArray, 0, i, new java.util.Comparator<androidx.constraintlayout.core.SolverVariable>() { // from class: androidx.constraintlayout.core.PriorityGoalRow.1
                @Override // java.util.Comparator
                public int compare(androidx.constraintlayout.core.SolverVariable solverVariable2, androidx.constraintlayout.core.SolverVariable solverVariable3) {
                    return solverVariable2.id - solverVariable3.id;
                }
            });
            for (int i6 = 0; i6 < this.numGoals; i6++) {
                this.arrayGoals[i6] = this.sortArray[i6];
            }
        }
        solverVariable.inGoal = true;
        solverVariable.addToRow(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeGoal(androidx.constraintlayout.core.SolverVariable solverVariable) {
        int i = 0;
        while (i < this.numGoals) {
            if (this.arrayGoals[i] == solverVariable) {
                while (true) {
                    int i2 = this.numGoals;
                    if (i < i2 - 1) {
                        androidx.constraintlayout.core.SolverVariable[] solverVariableArr = this.arrayGoals;
                        int i3 = i + 1;
                        solverVariableArr[i] = solverVariableArr[i3];
                        i = i3;
                    } else {
                        this.numGoals = i2 - 1;
                        solverVariable.inGoal = false;
                        return;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public void updateFromRow(androidx.constraintlayout.core.LinearSystem linearSystem, androidx.constraintlayout.core.ArrayRow arrayRow, boolean z) {
        androidx.constraintlayout.core.SolverVariable solverVariable = arrayRow.variable;
        if (solverVariable == null) {
            return;
        }
        androidx.constraintlayout.core.ArrayRow.ArrayRowVariables arrayRowVariables = arrayRow.variables;
        int currentSize = arrayRowVariables.getCurrentSize();
        for (int i = 0; i < currentSize; i++) {
            androidx.constraintlayout.core.SolverVariable variable = arrayRowVariables.getVariable(i);
            float variableValue = arrayRowVariables.getVariableValue(i);
            this.accessor.init(variable);
            if (this.accessor.addToGoal(solverVariable, variableValue)) {
                addToGoal(variable);
            }
            this.constantValue += arrayRow.constantValue * variableValue;
        }
        removeGoal(solverVariable);
    }

    @Override // androidx.constraintlayout.core.ArrayRow
    public java.lang.String toString() {
        java.lang.String str = " goal -> (" + this.constantValue + ") : ";
        for (int i = 0; i < this.numGoals; i++) {
            this.accessor.init(this.arrayGoals[i]);
            str = str + this.accessor + " ";
        }
        return str;
    }
}

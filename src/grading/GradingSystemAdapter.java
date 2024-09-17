package grading;

import target.SchoolManagementApp;

public class GradingSystemAdapter implements SchoolManagementApp {
    private final GradingSystem _gradingSystem;

    public GradingSystemAdapter(GradingSystem gradingSystem) {
        this._gradingSystem = gradingSystem;
    }

    @Override
    public void integrateSystem() {
        this._gradingSystem.recordGrades();
    }
}

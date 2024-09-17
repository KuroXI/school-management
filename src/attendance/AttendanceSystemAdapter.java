package attendance;

import target.SchoolManagementApp;

public class AttendanceSystemAdapter implements SchoolManagementApp {
    private final AttendanceSystem _attendanceSystem;

    public AttendanceSystemAdapter(AttendanceSystem attendanceSystem) {
        this._attendanceSystem = attendanceSystem;
    }

    @Override
    public void integrateSystem() {
        this._attendanceSystem.markAttendance();
    }
}

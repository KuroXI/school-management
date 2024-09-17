package library;

import target.SchoolManagementApp;

public class LibrarySystemAdapter implements SchoolManagementApp {
    private final LibrarySystem _librarySystem;

    public LibrarySystemAdapter(LibrarySystem librarySystem) {
        this._librarySystem = librarySystem;
    }

    @Override
    public void integrateSystem() {
        this._librarySystem.manageBooks();
    }
}

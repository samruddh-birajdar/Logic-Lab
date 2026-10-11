# Study Tracker

A menu-driven Java console application for recording and reviewing study sessions. It stores study logs between runs and supports searching, editing, deleting, reporting, and CSV export.

## Features

- **Add study logs** with a date, subject, duration, and description.
- **View all logs** in a consistent, date-sorted list.
- **Search logs** by subject or description (case-insensitive).
- **Edit existing logs** while keeping any fields you leave blank unchanged.
- **Delete logs** with a confirmation prompt.
- **Export to CSV** for use in spreadsheet applications.
- **Date-wise summary** showing study time per logged date and the average per logged day.
- **Subject-wise summary** showing total hours and each subject's share of recorded study time.
- **Input validation** for dates, menu choices, text fields, and study durations.
- **Persistent storage** using Java object serialization.

## Requirements

- Java Development Kit (JDK) 8 or newer.
- A terminal or command prompt.

The project uses standard Java libraries; no third-party dependencies or build tool are required.

## Getting Started

### 1. Clone the repository

Replace `YOUR-USERNAME` with your GitHub username:

```bash
git clone https://github.com/YOUR-USERNAME/Study-Tracker.git
cd Study-Tracker
```

Alternatively, download the repository as a ZIP file from GitHub and extract it.

### 2. Compile

```bash
javac StudyTrackerMain.java
```

### 3. Run

```bash
java StudyTrackerMain
```

## Menu

| Option | Action |
| --- | --- |
| 1 | Add study log |
| 2 | View all study logs |
| 3 | Search by subject or description |
| 4 | Edit a study log |
| 5 | Delete a study log |
| 6 | Export logs to CSV |
| 7 | View date-wise summary |
| 8 | View subject-wise summary |
| 9 | Save and exit |

## Data Storage

Study logs are saved in `StudyTracker.dat` in the application's **current working directory**. The file is created when the application first saves data. Keep this file if you want to retain your local records.

`StudyTracker.dat` is intentionally excluded from Git because it contains personal study records and is generated at runtime. CSV exports are also excluded by the `.gitignore` file.

**Important:** Java serialization is intended here as a simple local-storage approach for this learning project. Do not load serialized data files from untrusted sources. If the project grows, consider migrating to SQLite or another database.

## CSV Export

Choose **Export logs to CSV** from the menu and enter a filename, for example:

```text
study-log.csv
```

The application adds the `.csv` extension if it is missing. The exported file includes the date, subject, duration in hours, and description.

## Project Structure

```text
Study-Tracker/
├── StudyTrackerMain.java
├── README.md
├── .gitignore
└── LICENSE
```

The Java source contains three classes:

- `StudyLog` — represents and validates one study entry.
- `StudyTracker` — manages logs, input, persistence, search, editing, deletion, export, and summaries.
- `StudyTrackerMain` — starts the application and displays the menu.

## Limitations

- This is a single-user, command-line application.
- Records are stored in a local serialized file, not in a database.
- There is no graphical user interface or cloud synchronization.
- Study duration is limited to more than 0 and at most 24 hours per log entry.

## Contributing

Suggestions and improvements are welcome. For a change, create a branch, make the change, test it, and open a pull request.

## License

This project is licensed under the MIT License. See [LICENSE](LICENSE).

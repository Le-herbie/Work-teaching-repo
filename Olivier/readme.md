olivier, this is your coding folder, Ill tell you what you need todo and attatch it and commit it in your own branch below.

Week 1:
    This is a your pick of a language project so go figure, also you are able to work with nora, infact I want that cuz this is hard.

Part 1: Backend Architecture (Any OOP Language)

Choose your preferred backend stack (e.g., Java + HttpServer, Python + FastAPI/Flask, Node.js/TypeScript + Express, or C# + ASP.NET).

1. Battery Class

Models a 12V SLA robot battery tracked in the pits.
• Properties: batteryId (string), voltage (float/double), cycles (int), isPracticeOnly (boolean). ✔️
• Constructor Requirements:
	• Full Constructor: Accepts all four properties. ✔️
	• New Competition Battery Constructor (Overload or Default Params): Accepts only batteryId, defaulting voltage to 13.1, cycles to 0, and isPracticeOnly to false. ✔️
• Behavior:
	• isMatchReady(): Returns true only if voltage >= 12.7 and isPracticeOnly is false. ✔️

2. Subsystem Base Class

Models any CAN-connected mechanism on the robot.
• Properties: name (string), canId (int), currentLimitAmps (int).
• Constructor Requirements:
	• Full Constructor: Accepts name, canId, and currentLimitAmps. ✔️
	• Standard Breaker Constructor (Overload or Default Params): Accepts name and canId, defaulting currentLimitAmps to 40. ✔️

3. ShooterSubsystem Subclass (Inherits from Subsystem)

Extends Subsystem for a flywheel/launcher mechanism.
• Additional Properties: targetRpm (int), hasHood (boolean).
• Constructor Requirements:
	• Full Constructor: Accepts all base and subclass properties, passing name, canId, and currentLimitAmps up to the parent (super) constructor. ✔️
	• Fixed-Hood Constructor (Overload or Default Params): Accepts name, canId, and targetRpm, defaulting currentLimitAmps to 60 and hasHood to false. ✔️

4. Web Server & REST API (server / main entry point)

• Instantiate at least 3 batteries and 2 subsystems using a mix of your full and default constructors.
• Expose two endpoints:
	• GET /api/pit-status: Serializes your Battery and Subsystem instances into JSON and returns them to the frontend.
	• POST /api/batteries: Accepts JSON ({ "batteryId": "BAT-04", "voltage": 12.9 }) from the web UI. If voltage is omitted or null, instantiate the object using your 1-argument default constructor; otherwise, use your full constructor.

Part 2: Frontend Pit UI (index.html + app.js / styles.css)

Use vanilla HTML/CSS/JS—or React/Vue/Svelte if your team prefers.
• Pit Status Header: Displays your FRC Team Number and an overall "READY FOR QUEUE" badge (green only if at least one battery is match-ready).
• Battery Bank Grid: Fetches /api/pit-status and renders a card for each battery showing voltage, cycle count, and a color-coded status badge (MATCH READY vs. CHARGE / PRACTICE).
• Subsystem & CAN Table: Lists each mechanism's name, CAN ID, amp limit, target RPM, and hood status.
• Quick-Log Battery Form: Lets a pit crew member type a Battery ID (and optional voltage) and click "Log Battery" to hit POST /api/batteries and refresh the dashboard without reloading the page.

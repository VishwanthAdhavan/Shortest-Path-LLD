# 🧭 Shortest Path Finder

This project is a low-level design for finding the **shortest path** between two points (Adventure and Destination) on a grid without any obstacles.

---

## ✨ Problem Statement

Given:
- The **dimensions** of a matrix/grid.
- The **starting position** (Adventure).
- The **destination position**.

Your task is to find the **shortest path** between the two points on the grid without any obstacles.

---

## 🚀 Features

✅ **Flexible grid dimensions** — Works for any matrix size.  
✅ **Direct shortest path calculation** — Determines the minimal number of steps between the two points.  
✅ **Low-level design** — Ready for integration into larger pathfinding or game systems.

---

## 🧠 Assumptions

- Movement is allowed **up, down, left, right** (no diagonals).  
- The grid contains **no obstacles**.  
- Coordinates and dimensions are given as integers.

---

## 🛠️ Getting Started

#### 📂 Clone the repository:
```bash
git clone https://github.com/your-username/shortest-path-finder.git
cd shortest-path-finder
💻 Usage:
Implement the algorithm and pass:

Matrix dimensions

Start (Adventure) position

End (Destination) position

to receive the shortest path length or the path itself.

🧪 Test Cases
Example:

Input:
Grid size: 5 x 5
Adventure: (0, 0)
Destination: (4, 4)

Output:
Shortest path length: 8
Path: [(0,0) -> (1,0) -> ... -> (4,4)]
🤝 Contributing
Contributions are welcome! Please fork this repo and submit a pull request.

📄 License
This project is licensed under the MIT License.

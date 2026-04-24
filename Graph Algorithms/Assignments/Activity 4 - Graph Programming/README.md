# 🧩 Graph Algorithms – Exercise List 4

Implementation of graph-related problems proposed in **Exercise List 4** from the *Graph Algorithms (CMP2119)* course at PUC Goiás.

---

## 📚 About

This project contains solutions to a set of exercises focused on **graph representation, validation, and analysis**, implemented in **C**.

In addition to the required exercises, this exercise also includes the implementation of **Depth-First Search (DFS)**, used for graph traversal and structural analysis.

---

## 🧠 Purpose

* Practice graph representation techniques
* Implement validation for graph inputs
* Convert between different graph representations
* Analyze graph properties
* Implement fundamental graph algorithms (e.g., DFS)
* Strengthen problem-solving skills using graphs

---

## ⚙️ Technologies

* Language: **C**
* Concepts:

  * Graph Theory
  * Data Structures
  * Algorithm Design

---

## 📂 Structure

Each file corresponds to one exercise:

```bash
list-4/
 ├── 1.c
 ├── 2.c
 ├── 3.c
 ├── 4.c
 ├── 5.c
 ├── 6.c
```

---

## 🔍 Highlight – Depth-First Search (DFS)

This exercise includes an implementation of **Depth-First Search (DFS)**, a fundamental graph traversal algorithm.

### 📌 Features

* Traverses graph deeply before backtracking
* Can be used for:

  * Connectivity checking
  * Cycle detection
  * Graph exploration

### 💡 Implementation Details

* Implemented in **C**
* Uses recursio
* Works with adjacency representations

---

## 📌 Exercises Overview

### 🔹 1. Adjacency Matrix → Vertex Degree

* Reads an **adjacency matrix** of an undirected graph
* Validates input
* Outputs each vertex and its degree

---

### 🔹 2. Incidence Matrix → Degrees + Conversion

* Reads an **incidence matrix** of a directed graph
* Calculates:

  * In-degree
  * Out-degree
* Converts to **adjacency matrix**

---

### 🔹 3. Adjacency List → Matrix Conversion

* Reads a **graph as adjacency list**
* Displays:

  * Input list
  * Equivalent adjacency matrix

---

### 🔹 4. Graph Isomorphism (Basic Check)

* Receives two graphs
* Verifies if they satisfy:

  * Same number of vertices
  * Same number of edges
  * Same degree sequence

---

### 🔹 5. Graph Classification

* Determines if a graph is:

  * Cycle
  * Complete graph
  * Wheel graph

---

### 🔹 6. Eulerian Cycle Detection

* Checks if a graph contains a **Eulerian cycle**

---

## 🧪 Requirements

* Graphs are assumed to be:

  * Simple
  * Undirected
  * Connected (unless stated otherwise)

* All inputs are validated before processing

---

## 🎯 Learning Outcomes

Through this assignment, the following skills are developed:

* Graph representation (matrix, list, incidence)
* Depth-First Search (DFS) implementation
* Input validation and error handling
* Algorithmic reasoning
* Structural analysis of graphs
* Implementation in low-level language (C)

---

## 🚀 Purpose of This Repository

This project serves as:

* Practical training in graph algorithms
* Academic record of coursework
* Reference for graph implementations in C

---

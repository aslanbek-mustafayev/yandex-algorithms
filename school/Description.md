# SCHOOL CONSTRUCTION <br> Yandex Algorithm Training 2.0, Session 1 (Task D)

This program determines the optimal integer coordinate for building a school along a straight street. All students' homes are located at distinct integer points on one side of the street. The goal is to choose a school location (also at an integer point, possibly coinciding with a house) such that the **sum of the distances** from all homes to the school is minimized. In other words, the program finds the point that minimizes the total walking distance for all students.

## Specification

**Input:**

- **N**: number of students (1 ≤ N < 100,001)
- **Coordinates**: N distinct integers in strictly ascending order (each between -2×10⁹ and 2×10⁹)

**Logic:**

- The optimal position is the **median** of the sorted house coordinates.
- For even-sized lists, the upper median is chosen (consistent with the problem's examples).


## Example Inputs and Outputs

| Input (N and Coordinates) | Output |
| :--: | :--: |
| 4<br>1 2 3 4 | 3 |
| 3<br>-1 0 1 | 0 |

## Resource Limits

| Resource | Limit | Used |
| :-- | :-- | :-- |
| Time limit | 1 second | 0.525 s |
| Memory limit | 64 MB | 31.43 MB |

## License

This implementation is based on a problem from **Yandex.Algorithm Training 2.0, Session 1 (Task D)**.
Original problem © Yandex.

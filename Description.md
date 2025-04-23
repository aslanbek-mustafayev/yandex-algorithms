## Program Description

The program calculates the minimal number of intermediate stations Vitya must pass through on a circular metro line to travel from his starting station to his destination. It uses efficient mathematical logic to determine the shortest path.

### Solution Approach

1. **Input Handling**: Reads three integers (`N` = total stations, `a` = start station, `b` = end station).
2. **Distance Calculation**:
    - Computes the absolute difference between `a` and `b` (direct path).
    - Calculates the alternative path length by subtracting this difference from `N`.
3. **Optimal Path Selection**: Chooses the smaller of the two path lengths.
4. **Result Adjustment**: Subtracts 1 to exclude the start and end stations from the count.

### Explanation

- **Efficiency**: The solution uses O(1) time complexity with simple arithmetic operations.
- **Correctness**: Handles all edge cases, including wrap-around scenarios on the circular line.
- **Clarity**: Directly implements the mathematical logic for minimal intermediate stations, ensuring readability.

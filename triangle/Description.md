# POINT AND TRIANGLE <br> Yandex Algorithm Training 2.0, Session 1 (Task E)

This program determines whether a point lies inside/on a right isosceles triangle or outside, and if outside, identifies the closest vertex. The triangle has vertices at A(0,0), B(d,0), and C(0,d), with legs along the coordinate axes.

## Specification

**Input:**
Three integers in order:

- **d**: Triangle leg length (1 ≤ d ≤ 1000)
- **x**, **y**: Coordinates of point X (-1000 ≤ x, y ≤ 1000)

**Logic:**

1. **Inside/On Triangle Check**:
    - X satisfies:
        - x ≥ 0
        - y ≥ 0
        - x + y ≤ d
    - If true: output `0`
2. **Outside Triangle**:
    - Calculate distances to vertices:
        - A: √(x² + y²)
        - B: √((x-d)² + y²)
        - C: √(x² + (y-d)²)
    - Find minimum distance. If tied, choose the vertex with the smallest number.

## Example Inputs and Outputs

| d | x | y | Output |
| :--: | :--: | :--: | :--: |
| 5 | 1 | 1 | 0 |
| 3 | -1 | -1 | 1 |
| 4 | 4 | 4 | 2 |
| 4 | 2 | 2 | 0 |

## Resource Limits

| Resource | Limit | Used |
| :-- | :-- | :-- |
| Time limit | 1 second | 163 ms |
| Memory limit | 64 MB | 10.94 MB |

## License

This implementation is based on a problem from **Yandex.Algorithm Training 2.0, Session 1 (Task E)**.
Original problem © Yandex.

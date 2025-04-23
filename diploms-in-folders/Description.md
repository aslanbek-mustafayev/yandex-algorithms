# DIPLOMAS IN FOLDERS <br> Yandex Algorithm Training 2.0, Session 2 (Task E)

This program calculates the minimal worst-case time required for a user to locate a single target diploma hidden in one of multiple folders. The user can choose the order of checking folders but must examine every diploma in a folder sequentially (1 second per diploma) to confirm the target is not there.

## Specification

**Input:**

- **N**: Number of folders (1 ≤ N ≤ 100)
- **a₁, a₂, ..., aₙ**: Diploma counts per folder (1 ≤ aᵢ ≤ 100)

**Output:**

- Minimal worst-case time (seconds) to guarantee finding the diploma.

**Key Strategy:**
To minimize the worst-case scenario:

1. **Avoid checking the largest folder first**.
2. Check all **smaller folders first** (summing their sizes).
3. If the diploma is in the largest folder, the user will have checked all smaller folders first, then the largest.
4. If the diploma is in a smaller folder, the search stops once found.

Thus, the worst-case time equals the **total diplomas in all folders except the largest** (since the largest folder is checked last if needed).

## Example Input and Output

| Input (Folders) | Output | Explanation |
| :--: | :--: | :-- |
| 2<br>2 1 | 1 | Check folder 1 (1s). If not found, target is in folder 2. Total: 1s. |

## Resource Limits

| Resource | Limit | Used |
| :-- | :-- | :-- |
| Time limit | 1 second | 174 ms |
| Memory limit | 64 MB | 11.03 MB |

## License

This implementation is based on a problem from **Yandex.Algorithm Training 2.0, Session 2 (Task E)**.
Original problem © Yandex.

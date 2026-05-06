# rivet-svc-gateway-pipe

`rivet-svc-gateway-pipe` keeps a focused Kotlin implementation around backend services. The project goal is to design a Kotlin verification harness for gateway systems, covering visual model generation, layout fixtures, and failure-oriented tests.

## Purpose

The project exists to keep a narrow engineering decision visible and testable. For this repo, that decision is how queue pressure and worker slack should influence a review result.

## Rivet Svc Gateway Pipe Review Notes

For a quick review, compare `queue pressure` with `session drift` before reading the middle cases.

## What Is Covered

- `fixtures/domain_review.csv` adds cases for queue pressure and retry load.
- `metadata/domain-review.json` records the same cases in structured form.
- `config/review-profile.json` captures the read order and the two review questions.
- `examples/rivet-svc-gateway-walkthrough.md` walks through the case spread.
- The Kotlin code includes a review path for `queue pressure` and `session drift`.
- `docs/field-notes.md` explains the strongest and weakest cases.

## Implementation Notes

The repository has two validation layers: the original compact policy fixture and the domain review fixture. They are separate so one can change without hiding failures in the other.

The added Kotlin path is deliberately direct, with fixtures doing most of the explaining.

## Command

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

## Audit Path

The check exercises the source code and the review fixture. `stale` is the high score at 212; `recovery` is the low score at 148.

## Limits

This remains a local project with deterministic fixtures. It does not depend on credentials, hosted services, or live data. Future work should add richer malformed inputs before widening the public API.

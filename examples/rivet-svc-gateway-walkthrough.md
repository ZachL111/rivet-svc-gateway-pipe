# Rivet Svc Gateway Pipe Walkthrough

This walk-through keeps the domain vocabulary close to the data instead of burying it in prose.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | queue pressure | 165 | ship |
| stress | retry load | 171 | ship |
| edge | worker slack | 209 | ship |
| recovery | session drift | 148 | ship |
| stale | queue pressure | 212 | ship |

Start with `stale` and `recovery`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

The useful comparison is `queue pressure` against `session drift`, not the raw score alone.

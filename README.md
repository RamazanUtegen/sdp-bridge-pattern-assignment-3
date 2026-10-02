# Assignment 3: Bridge Pattern

This Java 17 project demonstrates the Bridge pattern with two independent dimensions: `Shape` (`Circle`, `Square`) and `Renderer` (`VectorRenderer`, `RasterRenderer`). A shape delegates drawing to its renderer. The demo changes each shape's renderer at runtime without replacing the shape.

## Structure

- `src/main/java/bridge`: pattern implementation and runnable demo
- `src/test/java/bridge`: small dependency-free checks
- `REPORT.md`: UML diagram and Clean Code discussion

## Run

From the repository root in PowerShell with JDK 17:

```powershell
New-Item -ItemType Directory -Force .build | Out-Null
javac -d .build (Get-ChildItem src/main/java/bridge/*.java).FullName
java -cp .build bridge.BridgeDemo
```

## Test

```powershell
javac -cp .build -d .build (Get-ChildItem src/test/java/bridge/*.java).FullName
java -cp .build bridge.BridgeTest
```

`VectorRenderer` returns SVG elements. `RasterRenderer` returns text grids of `*` characters. They are simple representations chosen to make the runtime switch visible in console output.

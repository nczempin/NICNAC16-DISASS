# NICNAC16-DISASS: Disassembler for the NICNAC16 CPU

## What Problem Does This Solve?
NICNAC16-DISASS is a disassembler specifically designed for the [NICNAC16 CPU architecture](https://github.com/nczempin/NICNAC16). It enables developers to convert NICNAC16 machine code back into human-readable assembly language, facilitating debugging, reverse engineering, and analysis of NICNAC16 programs. This tool bridges the gap between machine code and assembly language in the NICNAC16 ecosystem.

## Who Is This For?
- Developers working with the NICNAC16 CPU architecture
- Computer architecture enthusiasts interested in reverse engineering
- Students learning about disassembly and CPU design
- Anyone debugging or analyzing NICNAC16 machine code

## Current Implementation Status
- ✅ Basic machine code parsing
- ✅ Core instruction set disassembly
- ✅ Output formatting for readability
- 🚧 Advanced analysis features
- 🚧 Integration with other NICNAC16 tools
- 📋 Interactive disassembly mode
- 📋 Symbol table reconstruction

## Setup Instructions

### Prerequisites
- A C++20-compatible compiler (e.g., `g++` 10+, `clang++` 11+, or MSVC 2019)
- Basic understanding of assembly language and machine code concepts

### Installation
1. Clone the repository:
   ```
   git clone https://github.com/nczempin/NICNAC16-DISASS.git
   cd NICNAC16-DISASS
   ```

2. Build the source code:
   ```
   mkdir -p build
   g++ -std=c++20 -Wall -Wextra -pedantic cpp/disassembler.cpp -o build/disassembler
   ```

### Running the Disassembler
1. Prepare a NICNAC16 machine code file (e.g., `program.oa`)

2. Run the disassembler:
   ```
   ./build/disassembler program.oa
   ```

3. The disassembler will generate assembly code output that represents the original machine code

## Project Scope

### What This IS
- A disassembler for NICNAC16 machine code
- A tool for analyzing and debugging NICNAC16 programs
- Part of the NICNAC16 development ecosystem
- An educational project demonstrating disassembler construction principles

### What This IS NOT
- Not a decompiler (does not produce high-level language code)
- Not an assembler (see [NICNAC16-ASS](https://github.com/nczempin/NICNAC16-ASS) for that)
- Not a simulator for the NICNAC16 CPU (see [NICNAC16-SIM](https://github.com/nczempin/NICNAC16-SIM) for that)
- Not compatible with other CPU architectures

## Repository Structure
- `cpp/disassembler.cpp` - Main disassembler source code
- `testDisassembly.oa` - Test file for disassembly

## Disassembly Features
- Conversion of machine code opcodes to assembly mnemonics
- Address and operand extraction
- Formatted output for readability
- Basic analysis of code patterns

## Related Projects
- [NICNAC16](https://github.com/nczempin/NICNAC16) - The CPU architecture this disassembler targets
- [NICNAC16-ASS](https://github.com/nczempin/NICNAC16-ASS) - Assembler for NICNAC16
- [NICNAC16-SIM](https://github.com/nczempin/NICNAC16-SIM) - Simulator for NICNAC16
- [NICNAC16-CC](https://github.com/nczempin/NICNAC16-CC) - C compiler for NICNAC16

## Development Status
This is an experimental educational project in active development. Contributions and feedback are welcome.

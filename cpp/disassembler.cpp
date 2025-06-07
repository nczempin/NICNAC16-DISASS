#include <array>
#include <fstream>
#include <iostream>
#include <string>

int main(int argc, char* argv[]) {
    if (argc < 2) {
        std::cerr << "Usage: " << argv[0] << " <file>\n";
        return 1;
    }

    std::ifstream input(argv[1]);
    if (!input) {
        std::cerr << "Failed to open file: " << argv[1] << "\n";
        return 1;
    }

    const std::array<std::string, 8> opcodes{
        "NOP", "JMP", "BL", "RET", "LDA", "STA", "ADD", "BAN"};

    std::string line;
    while (std::getline(input, line)) {
        std::cout << line << '\n';
        if (line.size() < 4) {
            std::cerr << "Line too short: " << line << '\n';
            continue;
        }
        std::string instruction = line.substr(0, 4);
        int code = std::stoi(instruction, nullptr, 2);
        if (code < 0 || code >= opcodes.size()) {
            std::cerr << "Invalid opcode: " << code << " in line: " << line << '\n';
            continue;
        }
        std::cout << instruction << ", " << code << ": " << opcodes.at(code) << '\n';
    }

    return 0;
}

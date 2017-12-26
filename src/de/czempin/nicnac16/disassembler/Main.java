package de.czempin.nicnac16.disassembler;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

import com.google.common.collect.ImmutableList;
import com.google.common.io.Files;

public class Main {

	@SuppressWarnings("boxing")
	public static void main(String[] args) throws IOException {
		String[] opcodes = { "NOP", "JMP", "BL", "RET", "LDA", "STA", "ADD", "BAN" };
		Map<String, Integer> opcodeMap = new HashMap<>();
		int i = 0;
		for (String opcode : opcodes) {
			opcodeMap.put(opcode, i);
			++i;
		}

		File file = new File("testDisassembly.oa");
		Charset charset = Charset.defaultCharset();
		ImmutableList<String> lines = Files.asCharSource(file, charset).readLines();
		for (String line : lines) {
			System.out.println(line);

			String instruction = line.substring(0, 4);
			final int code = Integer.parseInt(instruction, 2);
			System.out.println(instruction + ", " + code + ": " + opcodes[code]);
		}
	}

}

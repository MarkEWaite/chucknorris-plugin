/**
 * Copyright (c) 2009 Cliffano Subagio
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package hudson.plugins.chucknorris;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import java.util.Random;

/**
 * {@link FactGenerator} provides Chuck Norris facts.
 * @author cliffano
 */
public class FactGenerator {

    /**
     * The configured Chuck Norris facts, from <a href="http://www.codesqueeze.com/the-ultimate-top-25-chuck-norris-the-programmer-jokes/"
     * >http://www.codesqueeze.com/the-ultimate-top-25-chuck-norris-the-
     * programmer-jokes/</a>.
     */
    private static final String[] FACTS = {
            "All arrays Chuck Norris declares are of infinite size, because Chuck Norris knows no bounds.",
            "Chuck Norris doesn't have disk latency because the hard drive knows to hurry the hell up.",
            "All browsers support the hex definitions #chuck and #norris for the colors black and blue.",
            "Chuck Norris can't test for equality because he has no equal.",
            "Chuck Norris doesn't need garbage collection because he doesn't call .Dispose(), he calls .DropKick().",
            "Chuck Norris's first program was kill -9.",
            "Chuck Norris burst the dot com bubble.",
            "Chuck Norris writes code that optimizes itself.",
            "Chuck Norris can write infinite recursion functions... and have them return.",
            "Chuck Norris can solve the Towers of Hanoi in one move.",
            "The only pattern Chuck Norris knows is God Object.",
            "Chuck Norris finished World of Warcraft.",
            "Project managers never ask Chuck Norris for estimations... ever.",
            "Chuck Norris doesn't use web standards as the web will conform to him.",
            "\"It works on my machine\" always holds true for Chuck Norris.",
            "Whiteboards are white because Chuck Norris scared them that way.",
            "Chuck Norris's beard can type 140 wpm.",
            "Chuck Norris can unit test an entire application with a single assert.",
            "Chuck Norris doesn't bug hunt, as that signifies a probability of failure. He goes bug killing.",
            "Chuck Norris's keyboard doesn't have a Ctrl key because nothing controls Chuck Norris.",
            "Chuck Norris doesn't need a debugger, he just stares down the bug until the code confesses.",
            "Chuck Norris can access private methods.",
            "Chuck Norris can instantiate an abstract class.",
            "Chuck Norris doesn't need to know about class factory pattern. He can instantiate interfaces.",
            "The class object inherits from Chuck Norris.",
            "For Chuck Norris, NP-Hard = O(1).",
            "Chuck Norris knows the last digit of PI.",
            "Chuck Norris can divide by zero.",
            "Chuck Norris doesn't get compiler errors, the language changes itself to accommodate Chuck Norris.",
            "The programs that Chuck Norris writes don't have version numbers because he only writes them once. If a user reports a bug or has a feature request they don't live to see the sun set.",
            "Chuck Norris doesn't believe in floating point numbers because they can't be typed on his binary keyboard.",
            "Chuck Norris solved the Travelling Salesman problem in O(1) time.",
            "Chuck Norris never gets a syntax error. Instead, the language gets a DoesNotConformToChuck error.",
            "No statement can catch the ChuckNorrisException.",
            "Chuck Norris doesn't program with a keyboard. He stares the computer down until it does what he wants.",
            "Chuck Norris doesn't pair program.",
            "Chuck Norris can write multi-threaded applications with a single thread.",
            "There is no Esc key on Chuck Norris' keyboard, because no one escapes Chuck Norris.",
            "Chuck Norris doesn't delete files, he blows them away.",
            "Chuck Norris can binary search unsorted data.",
            "Chuck Norris breaks RSA 128-bit encrypted codes in milliseconds.",
            "Chuck Norris went out of an infinite loop.",
            "Chuck Norris can read all encrypted data, because nothing can hide from Chuck Norris.",
            "Chuck Norris hosting is 101% uptime guaranteed.",
            "When a bug sees Chuck Norris, it flees screaming in terror, and then immediately self-destructs to avoid being roundhouse-kicked.",
            "Chuck Norris rewrote the Google search engine from scratch.",
            "Chuck Norris doesn't need the cloud to scale his applications, he uses his laptop.",
            "Chuck Norris can access the DB from the UI.",
            "Chuck Norris' protocol design method has no status, requests or responses, only commands.",
            "Chuck Norris' programs occupy 150% of CPU, even when they are not executing.",
            "Chuck Norris can spawn threads that complete before they are started.",
            "Chuck Norris programs do not accept input.",
            "Chuck Norris doesn't need an OS.",
            "Chuck Norris can compile syntax errors.",
            "Chuck Norris compresses his files by doing a flying round house kick to the hard drive.",
            "Chuck Norris doesn't use a computer because a computer does everything slower than Chuck Norris.",
            "You don't disable the Chuck Norris plug-in, it disables you.",
            "Chuck Norris doesn't need a java compiler, he goes straight to .war",
            "Chuck Norris can use GOTO as much as he wants to. Telling him otherwise is considered harmful.",
            "There is nothing regular about Chuck Norris' expressions.",
            "Quantum cryptography does not work on Chuck Norris. When something is being observed by Chuck it stays in the same state until he's finished. ",
            "There is no need to try catching Chuck Norris' exceptions for recovery; every single throw he does is fatal.",
            "Chuck Norris' beard is immutable.",
            "Chuck Norris' preferred IDE is hexedit.",
            "Chuck Norris is immutable. If something's going to change, it's going to have to be the rest of the universe.",
            "Chuck Norris' addition operator doesn't commute; it teleports to where he needs it to be.",
            "Anonymous methods and anonymous types are really all called Chuck Norris. They just don't like to boast.",
            "Chuck Norris doesn't have performance bottlenecks. He just makes the universe wait its turn.",
            "Chuck Norris does not use exceptions when programming. He has not been able to identify any of his code that is not exceptional.",
            "When Chuck Norris' code fails to compile the compiler apologises.",
            "Chuck Norris does not use revision control software. None of his code has ever needed revision.",
            "Chuck Norris can recite π. Backwards.",
            "When Chuck Norris points to null, null quakes in fear.",
            "Chuck Norris has root access to your system.",
            "When Chuck Norris gives a method an argument, the method loses",
            "Chuck Norris' keyboard doesn't have F1 key, the computer asks for help from him.",
            "Chuck Norris is too hard for soft deletes.",
            "Chuck Norris doesn’t do Burn Down charts, he does Smack Down charts.",
            "Chuck Norris can delete the Recycling Bin.",
            "When Chuck Norris presses Ctrl+Alt+Delete, worldwide computers restart is initiated.",
            "When Chuck Norris throws exceptions, it’s across the room.",
            "When Chuck Norris is web surfing websites get the message \"Warning: Internet Explorer has deemed this user to be malicious or dangerous. Proceed?\"."
    };

    /**
     * Random instance.
     */
    private static final Random RANDOM = new Random();

    /**
     * Retrieves a random fact.
     * @return a random fact
     */
    @SuppressFBWarnings(value = "DMI_RANDOM_USED_ONLY_ONCE")
    public String random() {
        return FACTS[RANDOM.nextInt(FACTS.length)];
    }
}

pdflatex main.tex -interaction=nonstopmode
bibtex main
pdflatex main.tex -interaction=nonstopmode
pdflatex main.tex -interaction=nonstopmode


pdflatex main.tex -interaction=nonstopmode
makeglossaries main
pdflatex main.tex -interaction=nonstopmode
pdflatex main.tex -interaction=nonstopmode

pdflatex main.tex -interaction=nonstopmode

main.pdf
exit
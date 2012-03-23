pdflatex main.tex 
makeglossaries main
bibtex main
pdflatex main.tex -interaction=nonstopmode
pdflatex main.tex -interaction=nonstopmode
main.pdf
exit
import * as React from 'react';
import FormConstruction from '../FormConstruction';

import TableStructure from './TableStructure';

function createData(
  nome: string,
  anoCostrucao: number,
  coordenacao: string,
  gerencia: string,
  diretoria: string,
  outorga: string,
  titularidade: string,
) {
  return { nome, anoCostrucao, coordenacao, gerencia, diretoria, outorga, titularidade };
}
const dateYear = new Date().getFullYear();
const rows = [
  createData('Frozen yoghurt', dateYear, "Zé Mario", "Rafael", " jangue", " que isso?", " Rafael"),
  createData('Frozen yoghurt', dateYear, "Zé Mario", "Rafael", " jangue", " que isso?", " Rafael"),
  createData('Frozen yoghurt', dateYear, "Zé Mario", "Rafael", " jangue", " que isso?", " Rafael"),
  createData('Frozen yoghurt', dateYear, "Zé Mario", "Rafael", " jangue", " que isso?", " Rafael"),
  createData('Frozen yoghurt', dateYear, "Zé Mario", "Rafael", " jangue", " que isso?", " Rafael"),
  createData('Frozen yoghurt', dateYear, "Zé Mario", "Rafael", " jangue", " que isso?", " Rafael")
];

export default function TableConstruction({ style }: { style: string }) {
  return (
    <TableStructure style={style} data={rows} />
    // <FormConstruction/>
  );
}